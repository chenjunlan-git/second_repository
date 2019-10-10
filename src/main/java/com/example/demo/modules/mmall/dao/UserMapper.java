package com.example.demo.modules.mmall.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.mmall.entiry.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author angy
 * @since 2019-10-09
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
