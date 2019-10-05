package com.example.demo.modules.hr.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 机构合同岗位按照项目类别发放工资、缴纳社保和公积金
 * 
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-11-14 09:38:50
 */
@TableName("hr_agency_contract_item")
public class HrAgencyContractItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 机构合同主键
	 */
	private Integer agencyContractId;
	/**
	 * 项目名称
	 */
	private String contentItem;
	/**
	 * 默认工资
	 */
	private BigDecimal defaultSalaryItem;
	/**
	 * 机构合同单位交-- 社保
	 */
	private BigDecimal socialItem;
	/**
	 * 机构合同单位交-- 公积金
	 */
	private BigDecimal fundItem;
	/**
	 * 机构合同单位交-- 残保金
	 */
	private BigDecimal disabledItem;

	/**
	 * 机构合同单位交-- 服务费
	 */
	@Getter
	@Setter
	private BigDecimal serviceItem;
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
	 * 设置：机构合同主键
	 */
	public void setAgencyContractId(Integer agencyContractId) {
		this.agencyContractId = agencyContractId;
	}
	/**
	 * 获取：机构合同主键
	 */
	public Integer getAgencyContractId() {
		return agencyContractId;
	}
	/**
	 * 设置：项目名称
	 */
	public void setContentItem(String contentItem) {
		this.contentItem = contentItem;
	}
	/**
	 * 获取：项目名称
	 */
	public String getContentItem() {
		return contentItem;
	}
	/**
	 * 设置：默认工资
	 */
	public void setDefaultSalaryItem(BigDecimal defaultSalaryItem) {
		this.defaultSalaryItem = defaultSalaryItem;
	}
	/**
	 * 获取：默认工资
	 */
	public BigDecimal getDefaultSalaryItem() {
		return defaultSalaryItem;
	}
	/**
	 * 设置：机构合同单位交-- 社保
	 */
	public void setSocialItem(BigDecimal socialItem) {
		this.socialItem = socialItem;
	}
	/**
	 * 获取：机构合同单位交-- 社保
	 */
	public BigDecimal getSocialItem() {
		return socialItem;
	}
	/**
	 * 设置：机构合同单位交-- 公积金
	 */
	public void setFundItem(BigDecimal fundItem) {
		this.fundItem = fundItem;
	}
	/**
	 * 获取：机构合同单位交-- 公积金
	 */
	public BigDecimal getFundItem() {
		return fundItem;
	}
	/**
	 * 设置：机构合同单位交-- 残保金
	 */
	public void setDisabledItem(BigDecimal disabledItem) {
		this.disabledItem = disabledItem;
	}
	/**
	 * 获取：机构合同单位交-- 残保金
	 */
	public BigDecimal getDisabledItem() {
		return disabledItem;
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
