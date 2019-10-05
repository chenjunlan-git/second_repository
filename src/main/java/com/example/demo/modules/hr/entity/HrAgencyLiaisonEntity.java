package com.example.demo.modules.hr.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 机构的联络人
 *
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-06-11 11:39:54
 */
@TableName("hr_agency_liaison")
public class HrAgencyLiaisonEntity implements Serializable {
    private static final long serialVersionUID = 1L;

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
     * 姓名
     */
    private String liaisonName;
    /**
     * 职位
     */
    private String position;
    /**
     * 联系电话
     */
    private String phoneNumber;
    /**
     * 传真
     */
    private String fax;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * QQ
     */
    private String qq;
    /**
     * 微信
     */
    private String wechat;
    /**
     * 是否为主联络人 1是 0否
     */
    private Integer mainLiaison;

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
     * 设置：姓名
     */
    public void setLiaisonName(String liaisonName) {
        this.liaisonName = liaisonName;
    }
    /**
     * 获取：姓名
     */
    public String getLiaisonName() {
        return liaisonName;
    }
    /**
     * 设置：职位
     */
    public void setPosition(String position) {
        this.position = position;
    }
    /**
     * 获取：职位
     */
    public String getPosition() {
        return position;
    }
    /**
     * 设置：联系电话
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * 获取：联系电话
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
     * 设置：传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }
    /**
     * 获取：传真
     */
    public String getFax() {
        return fax;
    }
    /**
     * 设置：电子邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 获取：电子邮箱
     */
    public String getEmail() {
        return email;
    }
    /**
     * 设置：QQ
     */
    public void setQq(String qq) {
        this.qq = qq;
    }
    /**
     * 获取：QQ
     */
    public String getQq() {
        return qq;
    }
    /**
     * 设置：微信
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }
    /**
     * 获取：微信
     */
    public String getWechat() {
        return wechat;
    }
    /**
     * 设置：是否为主联络人 1是 0否
     */
    public void setMainLiaison(Integer mainLiaison) {
        this.mainLiaison = mainLiaison;
    }
    /**
     * 获取：是否为主联络人 1是 0否
     */
    public Integer getMainLiaison() {
        return mainLiaison;
    }
}
