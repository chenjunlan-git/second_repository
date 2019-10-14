package com.example.demo.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.demo.modules.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * 系统用户
 *
 * @author yongjie.he
 * @date 2016年9月18日 上午9:34:11
 */
@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {

    /**
     * 查询用户的所有权限
     *
     * @param userId 用户ID
     */
    List<String> queryAllPerms(Long userId);

    /**
     * 查询用户的所有菜单ID
     */
    List<Long> queryAllMenuId(Long userId);

    /**
     * 根据用户名，查询系统用户
     */
    SysUserEntity queryByUserName(String username);

    /**
     * 根据用户名，查询是否机构管理员，0为否
     */
    int queryOrgRoleByUserName(String username);

    /**
     * 找到所有的用户
     *
     * @return
     */
    List<SysUserEntity> findAllUsers(RowBounds rowBounds, @Param("ew") Wrapper<SysUserEntity> wrapper);


    /**
     * 由cityId 查询 负责该区的领导人用户信息
     */
    List<SysUserEntity> queryUserByCity(String city);

    /**
     * 通过组织的ID，找其父组织对应的所有系统用户
     */
    List<SysUserEntity> queryUserByOrgId(Long orgId);

    /**
     * 获取当前机构的管理员用户新
     *
     * @param orgId 机构id
     */
    List<SysUserEntity> queryCurrentOrgManagerByOrgId(Long orgId, Integer manageFlag);

    /**
     * 通过用户id查询用户的手机号
     *
     * @param userIds 用户ids
     * @return
     */
    List<String> queryMobilePhonesByUserId(@Param("userIds") List<String> userIds);
}
