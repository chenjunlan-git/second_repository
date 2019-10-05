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
 * 单项结算主表
 * 
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-11-06 16:19:49
 */
@TableName("bu_payoff_one")
public class BuPayoffOneEntity implements Serializable {
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
	 * 结算内容
	 */
	private String payoffContent;
	/**
	 * 结算小计
	 */
	private BigDecimal subtotalPayoff;
	/**
	 * 是否交所得税 1交 0不交
	 */
	private Integer incomeTaxType;
	/**
	 * 个税类别：1新版个税税率  2旧版个税税率
	 */
	private Integer salaryTaxType;
	/**
	 * 结算状态 1未结算 2提交结算  3工资表审核通过 9申请开票中 4 已开票  5收款中 6 需发工资 7 已发工资 8 已完成
	 */
	private Integer payoffStatus;
	/**
	 * 结算类别：1正常结算  2单项结算 3预付款
	 */
	private Integer payoffType;
	/**
	 * 是否开具发票 1是 0否
	 */
	private Integer invoiceFlag;

    @Getter
    @Setter
    private Integer signatureFlag;

	/**
	 * 是否合并到工资一起发放 1是 0否
	 */
	@Getter
	@Setter
	private Integer joinSalaryFlag;

	/**
	 * 结算组合
	 */
	@Getter
	@Setter
	private String subtotalPayoffs;

	/**
	 * 结算组合排序
	 */
	@Getter
	@Setter
	private String subtotalPayoffsSort;

	/**
	 * 扣税方式 1工资薪金所得  2年终奖所得 3不扣税(补偿金)
	 */
	@Getter
	@Setter
	private Integer taxType;

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
	 * 单结算表子集
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	List<BuPayoffOneSubEntity> buPayoffOneSubEntityList;

	@TableField(exist = false)
	@Getter
	@Setter
	/**
	 * 结算提交的备注
	 */
	String content;

	/**
	 * 结余抵扣
	 */
	@Getter
	@Setter
	private BigDecimal balanceDeduction;

	/**
	 * 结余抵扣备注
	 */
	@Getter
	@Setter
	private String balanceDeductionRemark;

    /**
     * 发票说明
     */
    @Getter
    @Setter
	private String explainInvoice;

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
	 * 设置：结算内容
	 */
	public void setPayoffContent(String payoffContent) {
		this.payoffContent = payoffContent;
	}
	/**
	 * 获取：结算内容
	 */
	public String getPayoffContent() {
		return payoffContent;
	}
	/**
	 * 设置：结算小计
	 */
	public void setSubtotalPayoff(BigDecimal subtotalPayoff) {
		this.subtotalPayoff = subtotalPayoff;
	}
	/**
	 * 获取：结算小计
	 */
	public BigDecimal getSubtotalPayoff() {
		return subtotalPayoff;
	}
	/**
	 * 设置：是否交所得税 1交 0不交
	 */
	public void setIncomeTaxType(Integer incomeTaxType) {
		this.incomeTaxType = incomeTaxType;
	}
	/**
	 * 获取：是否交所得税 1交 0不交
	 */
	public Integer getIncomeTaxType() {
		return incomeTaxType;
	}
	/**
	 * 设置：个税类别：1新版个税税率  2旧版个税税率
	 */
	public void setSalaryTaxType(Integer salaryTaxType) {
		this.salaryTaxType = salaryTaxType;
	}
	/**
	 * 获取：个税类别：1新版个税税率  2旧版个税税率
	 */
	public Integer getSalaryTaxType() {
		return salaryTaxType;
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
