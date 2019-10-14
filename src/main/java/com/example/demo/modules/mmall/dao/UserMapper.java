package com.example.demo.modules.mmall.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.mmall.entiry.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author angy
 * @since 2019-10-09
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
    /**
     * 根据用户名和密码检验用户登录
     *
     * @param username
     * @param password
     * @return
     */
    int queryPassword(@Param("username") String username, @Param("password") String password);

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    UserEntity queryLogin(@Param("username") String username);

    /**
     * 检验用户名是否存在
     *
     * @param username
     * @return
     */
    int checkUsername(@Param("username") String username);

    /**
     * 检验Email是否存在
     *
     * @param email
     * @return
     */
    int checkEmail(@Param("email") String email);

    /**
     * 根据用户名查询提示答案
     *
     * @param username
     * @return
     */
    String queryAnsterByusername(@Param("username") String username);

    /**
     * 通过用户名，提示问题，答案
     * 获取token
     *
     * @param username
     * @param question
     * @param answer
     * @return
     */
    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    /**
     * 根据用户名更新密码
     *
     * @param username
     * @param passwordNew
     * @return
     */
    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);

    /**
     * 根据用户名获取用户实体类
     *
     * @param username
     * @return
     */
    UserEntity queryUserEntityByUsername(@Param("username") String username);

    /**
     * 根据用户名和密码
     * 查询用户是否存在
     *
     * @param username
     * @param passwordOld
     * @return
     */
    int checkPassword(@Param("username") String username, @Param("passwordOld") String passwordOld);

    /**
     * 根据Id检验Email是否重复
     * @param id
     * @param email
     * @return
     */
    int selectEmail(@Param("id")Integer id, @Param("email")String email);
}
