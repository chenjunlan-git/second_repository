package com.example.demo.modules.hr.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 机构合同设置默认工资、缴纳社保和公积金
 * 
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-11-14 09:38:49
 */
@TableName("hr_agency_contract_salary")
public class HrAgencyContractSalaryEntity implements Serializable {
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
	 * 默认工资
	 */
	private BigDecimal defaultSalary;
	/**
	 * 社保城市类别-- 设置主表
	 */
	private Integer socialSecurityId;
	/**
	 * 缴存类型 1按工资交 2按商议交
	 */
	private Integer depositType;
	/**
	 * 社保缴费基数
	 */
	private BigDecimal socialSecurityBaseFee;
	/**
	 * 公积金缴费基数
	 */
	private BigDecimal accumulationFundBaseFee;
	/**
	 * 养老类别--设置表--算社保公积金用
	 */
	private Integer pensionInsuranceType;
	/**
	 * 医疗类别--设置表--算社保公积金用
	 */
	private Integer medicalInsuranceType;
	/**
	 * 失业类别--设置表--算社保公积金用
	 */
	private Integer employeeAccumulationType;
	/**
	 * 工伤--设置表--算社保公积金用
	 */
	private Integer injuryType;
	/**
	 * 生育--设置表--算社保公积金用
	 */
	private Integer birthType;
	/**
	 * 公积金类别--设置表--算社保公积金用
	 */
	private Integer fundType;
	/**
	 * 残保金类别--设置表--算社保公积金用
	 */
	private Integer disabledType;
	/**
	 * 大病救助类别--设置表--算社保公积金用
	 */
	@Getter
	@Setter
	private Integer illnessType;
	/**
	 * 创建者
	 */
	private Integer createUser;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改者
	 */
	private Integer updateUser;
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
	 * 设置：默认工资
	 */
	public void setDefaultSalary(BigDecimal defaultSalary) {
		this.defaultSalary = defaultSalary;
	}
	/**
	 * 获取：默认工资
	 */
	public BigDecimal getDefaultSalary() {
		return defaultSalary;
	}
	/**
	 * 设置：社保城市类别-- 设置主表
	 */
	public void setSocialSecurityId(Integer socialSecurityId) {
		this.socialSecurityId = socialSecurityId;
	}
	/**
	 * 获取：社保城市类别-- 设置主表
	 */
	public Integer getSocialSecurityId() {
		return socialSecurityId;
	}
	/**
	 * 设置：缴存类型 1按工资交 2按商议交
	 */
	public void setDepositType(Integer depositType) {
		this.depositType = depositType;
	}
	/**
	 * 获取：缴存类型 1按工资交 2按商议交
	 */
	public Integer getDepositType() {
		return depositType;
	}
	/**
	 * 设置：社保缴费基数
	 */
	public void setSocialSecurityBaseFee(BigDecimal socialSecurityBaseFee) {
		this.socialSecurityBaseFee = socialSecurityBaseFee;
	}
	/**
	 * 获取：社保缴费基数
	 */
	public BigDecimal getSocialSecurityBaseFee() {
		return socialSecurityBaseFee;
	}
	/**
	 * 设置：公积金缴费基数
	 */
	public void setAccumulationFundBaseFee(BigDecimal accumulationFundBaseFee) {
		this.accumulationFundBaseFee = accumulationFundBaseFee;
	}
	/**
	 * 获取：公积金缴费基数
	 */
	public BigDecimal getAccumulationFundBaseFee() {
		return accumulationFundBaseFee;
	}
	/**
	 * 设置：养老类别--设置表--算社保公积金用
	 */
	public void setPensionInsuranceType(Integer pensionInsuranceType) {
		this.pensionInsuranceType = pensionInsuranceType;
	}
	/**
	 * 获取：养老类别--设置表--算社保公积金用
	 */
	public Integer getPensionInsuranceType() {
		return pensionInsuranceType;
	}
	/**
	 * 设置：医疗类别--设置表--算社保公积金用
	 */
	public void setMedicalInsuranceType(Integer medicalInsuranceType) {
		this.medicalInsuranceType = medicalInsuranceType;
	}
	/**
	 * 获取：医疗类别--设置表--算社保公积金用
	 */
	public Integer getMedicalInsuranceType() {
		return medicalInsuranceType;
	}
	/**
	 * 设置：失业类别--设置表--算社保公积金用
	 */
	public void setEmployeeAccumulationType(Integer employeeAccumulationType) {
		this.employeeAccumulationType = employeeAccumulationType;
	}
	/**
	 * 获取：失业类别--设置表--算社保公积金用
	 */
	public Integer getEmployeeAccumulationType() {
		return employeeAccumulationType;
	}
	/**
	 * 设置：工伤--设置表--算社保公积金用
	 */
	public void setInjuryType(Integer injuryType) {
		this.injuryType = injuryType;
	}
	/**
	 * 获取：工伤--设置表--算社保公积金用
	 */
	public Integer getInjuryType() {
		return injuryType;
	}
	/**
	 * 设置：生育--设置表--算社保公积金用
	 */
	public void setBirthType(Integer birthType) {
		this.birthType = birthType;
	}
	/**
	 * 获取：生育--设置表--算社保公积金用
	 */
	public Integer getBirthType() {
		return birthType;
	}
	/**
	 * 设置：公积金类别--设置表--算社保公积金用
	 */
	public void setFundType(Integer fundType) {
		this.fundType = fundType;
	}
	/**
	 * 获取：公积金类别--设置表--算社保公积金用
	 */
	public Integer getFundType() {
		return fundType;
	}
	/**
	 * 设置：残保金类别--设置表--算社保公积金用
	 */
	public void setDisabledType(Integer disabledType) {
		this.disabledType = disabledType;
	}
	/**
	 * 获取：残保金类别--设置表--算社保公积金用
	 */
	public Integer getDisabledType() {
		return disabledType;
	}
	/**
	 * 设置：创建者
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：创建者
	 */
	public Integer getCreateUser() {
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
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * 获取：修改者
	 */
	public Integer getUpdateUser() {
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
