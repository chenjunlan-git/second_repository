package com.example.demo.modules.bu.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * 单项结算子表
 * 
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-11-06 16:19:50
 */
@TableName("bu_payoff_one_sub")
public class BuPayoffOneSubEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 单结算主表ID
	 */
	private Integer payoffOneId;
	/**
	 * 机构合同ID
	 */
	private Integer agencyContractId;
	/**
	 * 人才ID
	 */
	private Integer poolId;

	/**
	 * 类型：1合同员工、2代发员工
	 */
	@Getter
	@Setter
	private Integer poolType;


	/**
	 * 个人合同ID
	 */
	private Integer employeeContractId;
	/**
	 * 结算月份
	 */
	private String payoffYearMonth;
	/**
	 * 单项目金额
	 */
	private BigDecimal payoffOneFee;
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
	 * 结算组合 可能多项
	 */
	@Getter
	@Setter
	private String payoffOneFees;

	/**
	 * 是否合并到工资一起发放 1是 0否
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private Integer joinSalaryFlag;

	/**
	 * 个人合同开始时间
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private Date contractStartDate;



	/**
	 * 个人合同结束时间
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private Date contractEndDate;

	/**
	 * 岗位
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private String workTitle;

	/**
	 * 人名
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private String poolName;


	/**
	 * 个人合同范围
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private String contractTerm;

	/**
	 * 单项结算项目名称
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private String payoffContent;

	/**
	 * 扣税方式 1工资薪金所得  2年终奖所得 3不扣税(补偿金)
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private Integer taxType;


	/**
	 * 批量增加的列
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private String item;

	/**
	 * 批量增加的列
	 */
	@TableField(exist = false)
	@Getter
	@Setter
	private ArrayList<String> itemArr;


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
	 * 设置：单结算主表ID
	 */
	public void setPayoffOneId(Integer payoffOneId) {
		this.payoffOneId = payoffOneId;
	}
	/**
	 * 获取：单结算主表ID
	 */
	public Integer getPayoffOneId() {
		return payoffOneId;
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
	 * 设置：人才ID
	 */
	public void setPoolId(Integer poolId) {
		this.poolId = poolId;
	}
	/**
	 * 获取：人才ID
	 */
	public Integer getPoolId() {
		return poolId;
	}
	/**
	 * 设置：个人合同ID
	 */
	public void setEmployeeContractId(Integer employeeContractId) {
		this.employeeContractId = employeeContractId;
	}
	/**
	 * 获取：个人合同ID
	 */
	public Integer getEmployeeContractId() {
		return employeeContractId;
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
	 * 设置：单项目金额
	 */
	public void setPayoffOneFee(BigDecimal payoffOneFee) {
		this.payoffOneFee = payoffOneFee;
	}
	/**
	 * 获取：单项目金额
	 */
	public BigDecimal getPayoffOneFee() {
		return payoffOneFee;
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
