package com.example.demo.modules.sys.entity;


import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 角色
 *
 * @author heyongjie
 * @email yongjie.he@xfktech.com
 * @date 2018-06-07 19:29:56
 */
@Data
@TableName("sys_role")
public class SysRoleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //角色类型
    public static final Integer USER = 0;//普通员工
    public static final Integer MANAGER = 1; //管理员
    public static final Integer PRINCIPAL = 2;//部门负责人
    public static final Integer VICE_PRESIDENT = 3; //副总裁
    public static final Integer PRESIDENT = 4;//总裁

    /**
     * 角色ID
     */
    @TableId
    private Long roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者ID
     */
    private Long createUserId;

    @TableField(exist = false)
    private List<Long> menuIdList;

    @TableField(exist = false)
    private SysOrganizationEntity organizationEntity;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 管理者标记  1：管理者 0：普通员工
     */
    private Integer manageFlag;
    /**
     *
     */
    private Long updateUserId;
    /**
     *
     */
    private Date updateTime;

}
