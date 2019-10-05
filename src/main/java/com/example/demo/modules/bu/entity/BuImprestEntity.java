package com.example.demo.modules.bu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 预付款结算表
 * 
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-11-06 16:19:50
 */
@TableName("bu_imprest")
public class BuImprestEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 机构ID
	 */
	private Long agencyId;
	/**
	 * 机构合同ID
	 */
	private Integer agencyContractId;
	/**
	 * 结算月份
	 */
	private String payoffYearMonth;
	/**
	 * 预付款内容
	 */
	private String imprestContent;
	/**
	 * 预付款小计
	 */
	private BigDecimal subtotalImprest;
	/**
	 * 结算类别：1正常结算  2单项结算 3预付款
	 */
	private Integer payoffType;
	/**
	 * 结算状态 1未结算 2提交结算  3工资表审核通过 9申请开票中 4 已开票  5收款中 6 需发工资 7 已发工资 8 已完成
	 */
	private Integer payoffStatus;
	/**
	 * 是否开具发票 1是 0否
	 */
	private Integer invoiceFlag;
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

    @Getter
    @Setter
    private Integer signatureFlag;

	//预付款子表列表
	@Getter
	@Setter
	@TableField(exist = false)
	private List<BuImprestSubEntity> buImprestSubEntityList;

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
	 * 设置：预付款内容
	 */
	public void setImprestContent(String imprestContent) {
		this.imprestContent = imprestContent;
	}
	/**
	 * 获取：预付款内容
	 */
	public String getImprestContent() {
		return imprestContent;
	}
	/**
	 * 设置：预付款小计
	 */
	public void setSubtotalImprest(BigDecimal subtotalImprest) {
		this.subtotalImprest = subtotalImprest;
	}
	/**
	 * 获取：预付款小计
	 */
	public BigDecimal getSubtotalImprest() {
		return subtotalImprest;
	}
	/**
	 * 设置：结算类别：1正常结算  2单项结算 3预付款
	 */
	public void setPayoffType(Integer payoffType) {
		this.payoffType = payoffType;
	}
	/**
	 * 获取：结算类别：1正常结算  2单项结算 3预付款
	 */
	public Integer getPayoffType() {
		return payoffType;
	}
	/**
	 * 设置：结算状态 1未结算 2提交结算  3工资表审核通过 9申请开票中 4 已开票  5收款中 6 需发工资 7 已发工资 8 已完成
	 */
	public void setPayoffStatus(Integer payoffStatus) {
		this.payoffStatus = payoffStatus;
	}
	/**
	 * 获取：结算状态 1未结算 2提交结算  3工资表审核通过 9申请开票中 4 已开票  5收款中 6 需发工资 7 已发工资 8 已完成
	 */
	public Integer getPayoffStatus() {
		return payoffStatus;
	}
	/**
	 * 设置：是否开具发票 1是 0否
	 */
	public void setInvoiceFlag(Integer invoiceFlag) {
		this.invoiceFlag = invoiceFlag;
	}
	/**
	 * 获取：是否开具发票 1是 0否
	 */
	public Integer getInvoiceFlag() {
		return invoiceFlag;
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
