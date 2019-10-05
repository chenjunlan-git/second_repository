package com.example.demo.modules.sys.oauth2;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.modules.bu.entity.BuUserAgencyEntity;
import com.example.demo.modules.bu.service.BuUserAgencyService;
import com.example.demo.modules.sys.entity.SysUserEntity;
import com.example.demo.modules.sys.entity.SysUserTokenEntity;
import com.example.demo.modules.sys.service.ShiroService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * 认证
 *
 * @author  heyongjie
 * @date  2018/5/2
 * @updater
 */
@Component
public class OAuth2Realm extends AuthorizingRealm {
    @Autowired
    private ShiroService shiroService;

    @Autowired
    private BuUserAgencyService buUserAgencyService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof OAuth2Token;
    }

    /**
     * 授权(验证权限时调用)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SysUserEntity user = (SysUserEntity)principals.getPrimaryPrincipal();
        Long userId = user.getUserId();

        /**
         * 用户权限列表
         */
        Set<String> permsSet = shiroService.getUserPermissions(userId);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(permsSet);
        return info;
    }

    /**
     * 认证(登录时调用)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String accessToken = (String) token.getPrincipal();

        /**
         * 根据accessToken，查询用户信息
         */
        SysUserTokenEntity tokenEntity = shiroService.queryByToken(accessToken);
        /**
         * token失效
         */
        if(tokenEntity == null || tokenEntity.getExpireTime().getTime() < System.currentTimeMillis()){
            throw new IncorrectCredentialsException("token失效，请重新登录");
        }

        /**
         * 查询用户信息
         */
        SysUserEntity user = shiroService.queryUser(tokenEntity.getUserId());

        /**
         * 查找用户管理的机构         *
         */
        List<BuUserAgencyEntity> buUserAgencyEntityList = buUserAgencyService.selectList(new EntityWrapper<BuUserAgencyEntity>().eq("user_id",user.getUserId()));
        if(buUserAgencyEntityList != null && buUserAgencyEntityList.size() > 0){
            Long[] agencyIds = new Long[buUserAgencyEntityList.size()];
            for ( int i =0 ;i < buUserAgencyEntityList.size();i++) {
                agencyIds[i] = buUserAgencyEntityList.get(i).getAgencyId();
            }
            user.setAgencyIds(agencyIds);
        }


        /**
         * 账号锁定
         */
        if(user.getStatus() == 0){
            throw new LockedAccountException("账号已被锁定,请联系管理员");
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, accessToken, getName());
        return info;
    }
}
