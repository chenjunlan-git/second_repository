package com.example.demo.modules.hr.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 机构付款账户表
 机构的付款账户信息
 *
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-06-11 11:39:54
 */
@TableName("hr_agency_payment_account")
public class HrAgencyPaymentAccountEntity implements Serializable {
    private static final long serialVersionUID = 1L;



    /**
     * 最新 1是 0否
     */
    private Integer newest;

    /**
     * ID
     */
    @TableId
    private Integer id;
    /**
     * 机构ID
     */
    private Integer agencyId;
    /**
     * 账户类型 1基本账户、2一般账户、3专用账户、4临时账户
     */
    private Integer accountType;
    /**
     * 开户行
     */
    private String bankName;
    /**
     * 银行帐号
     */
    private String bankAccountCode;
    /**
     * 账户状态 1正常 2冻结 3注销
     */
    private Integer accountStatus;

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

    /**
     * 设置：ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * 获取：ID
     */
    public Integer getId() {
        return id;
    }
    /**
     * 设置：机构ID
     */
    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }
    /**
     * 获取：机构ID
     */
    public Integer getAgencyId() {
        return agencyId;
    }
    /**
     * 设置：账户类型 1基本账户、2一般账户、3专用账户、4临时账户
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }
    /**
     * 获取：账户类型 1基本账户、2一般账户、3专用账户、4临时账户
     */
    public Integer getAccountType() {
        return accountType;
    }
    /**
     * 设置：开户行
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    /**
     * 获取：开户行
     */
    public String getBankName() {
        return bankName;
    }
    /**
     * 设置：银行帐号
     */
    public void setBankAccountCode(String bankAccountCode) {
        this.bankAccountCode = bankAccountCode;
    }
    /**
     * 获取：银行帐号
     */
    public String getBankAccountCode() {
        return bankAccountCode;
    }
    /**
     * 设置：账户状态 1正常 2冻结 3注销
     */
    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }
    /**
     * 获取：账户状态 1正常 2冻结 3注销
     */
    public Integer getAccountStatus() {
        return accountStatus;
    }

    public Integer getNewest() {
        return newest;
    }

    public void setNewest(Integer newest) {
        this.newest = newest;
    }
}
