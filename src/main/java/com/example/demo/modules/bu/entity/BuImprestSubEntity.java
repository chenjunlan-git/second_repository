package com.example.demo.modules.bu.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 预付款结算子表
 * 
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-11-06 16:19:50
 */
@TableName("bu_imprest_sub")
public class BuImprestSubEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 预算结算主表ID
	 */
	private Integer imprestId;
	/**
	 * 机构合同ID
	 */
	private Integer agencyContractId;

	/**
	 * 结算月份
	 */
	private String payoffYearMonth;
	/**
	 * 预算内容
	 */
	private String imprestContent;
	/**
	 * 预算金额
	 */
	private BigDecimal imprestFee;
	/**
	 * 备注
	 */
	private String payoffRemark;
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
	 * 设置：预算结算主表ID
	 */
	public void setImprestId(Integer imprestId) {
		this.imprestId = imprestId;
	}
	/**
	 * 获取：预算结算主表ID
	 */
	public Integer getImprestId() {
		return imprestId;
	}
	/**
	 * 设置：机构合同ID
	 */
	public void setAgencyContractId(Integer agencyContractId) {
		this.agencyContractId = agencyContractId;
	}
	/**
	 * 获取：机构合同ID
	 */
	public Integer getAgencyContractId() {
		return agencyContractId;
	}

	/**
	 * 设置：结算月份
	 */
	public void setPayoffYearMonth(String payoffYearMonth) {
		this.payoffYearMonth = payoffYearMonth;
	}
	/**
	 * 获取：结算月份
	 */
	public String getPayoffYearMonth() {
		return payoffYearMonth;
	}
	/**
	 * 设置：预算内容
	 */
	public void setImprestContent(String imprestContent) {
		this.imprestContent = imprestContent;
	}
	/**
	 * 获取：预算内容
	 */
	public String getImprestContent() {
		return imprestContent;
	}
	/**
	 * 设置：预算金额
	 */
	public void setImprestFee(BigDecimal imprestFee) {
		this.imprestFee = imprestFee;
	}
	/**
	 * 获取：预算金额
	 */
	public BigDecimal getImprestFee() {
		return imprestFee;
	}
	/**
	 * 设置：备注
	 */
	public void setPayoffRemark(String payoffRemark) {
		this.payoffRemark = payoffRemark;
	}
	/**
	 * 获取：备注
	 */
	public String getPayoffRemark() {
		return payoffRemark;
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
