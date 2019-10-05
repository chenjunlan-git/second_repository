package com.example.demo.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.example.demo.common.validator.group.AddGroup;
import com.example.demo.common.validator.group.UpdateGroup;
import com.example.demo.modules.sys.entity.SysRoleEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author heyongjie
 * @description 系统用户实体类
 * @date 2018/5/2
 * @updater
 */
@Data
@TableName("sys_user")
public class SysUserEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId
    private Long userId;

    /**
     * 用户名
     */
    @NotEmpty(message="用户名不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String username;

    /**
     * 密码
     */
    @NotEmpty(message="密码不能为空", groups = AddGroup.class)
    private String password;

    /**
     * 盐
     */
    @JsonIgnore
    private String salt;

    /**
     * 邮箱
     * @Email(message="邮箱格式不正确", groups = {AddGroup.class, UpdateGroup.class})
     * 过时了，暂时不用
     */
    @NotEmpty(message="邮箱不能为空", groups = {AddGroup.class, UpdateGroup.class})
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态  0：禁用   1：正常
     */
    private Integer status;

    /**
     * 角色ID列表
     */
    @JsonIgnore
    @TableField(exist=false)
    private List<Long> roleIdList;

    /**
     * 创建者ID
     */
    private Long createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 真实姓名
     */
    private String realName;
    /**
     *
     */
    private String employeeNumber;
    /**
     *
     */
    private Long updateUserId;
    /**
     *
     */
    private Date updateTime;

    @TableField(exist=false)
    private List<SysRoleEntity> sysRoleEntities;

    /**
     * 用户管理的机构ID
     */
    @TableField(exist=false)
    private Long[] agencyIds;

    @TableField(exist=false)
    private String base64;
}
