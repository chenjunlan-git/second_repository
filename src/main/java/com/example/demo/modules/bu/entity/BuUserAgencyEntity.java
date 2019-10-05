package com.example.demo.modules.bu.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 部门人员分工表
 *
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-07-25 18:35:26
 */
@TableName("bu_user_agency")
public class BuUserAgencyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Long id;
    /**
     * 客服ID
     */
    private Long userId;
    /**
     * 机构ID
     */
    private Long agencyId;
    /**
     * 创建者
     */
    private Long createUser;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改者
     */
    private Long updateUser;
    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 设置：
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * 获取：
     */
    public Long getId() {
        return id;
    }
    /**
     * 设置：客服ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    /**
     * 获取：客服ID
     */
    public Long getUserId() {
        return userId;
    }
    /**
     * 设置：机构ID
     */
    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }
    /**
     * 获取：机构ID
     */
    public Long getAgencyId() {
        return agencyId;
    }
    /**
     * 设置：创建者
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }
    /**
     * 获取：创建者
     */
    public Long getCreateUser() {
        return createUser;
    }
    /**
     * 设置：创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**
     * 获取：创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }
    /**
     * 设置：修改者
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }
    /**
     * 获取：修改者
     */
    public Long getUpdateUser() {
        return updateUser;
    }
    /**
     * 设置：修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**
     * 获取：修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }
}
