package com.example.demo.modules.hr.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.example.demo.modules.sys.entity.SysUploadFileEntity;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 机构合同
 *
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-06-11 11:39:45
 */
@TableName("hr_agency_contract")
public class HrAgencyContractEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public Integer getContractProjectType() {
        return ContractProjectType;
    }

    public void setContractProjectType(Integer contractProjectType) {
        ContractProjectType = contractProjectType;
    }

    /**
     * 合同项目类型 1派遣 2委派 3购买  4项目 5特色 99其他
     */
    private Integer ContractProjectType;

    //代收社保公积金方式 1代收当月 2代收次月
    @Getter
    @Setter
    private Integer collectionSocialType;

    /**
     * 合同附件表
     */
    @Getter
    @Setter
    @TableField(exist = false)
    private List<SysUploadFileEntity> sysUploadFileEntityList;


    /**
     * 合同中 岗位按照项目类别发放工资、缴纳社保和公积金设置列表
     */
    @Getter
    @Setter
    @TableField(exist = false)
    List<HrAgencyContractItemEntity> hrAgencyContractItemEntityList;

    /**
     * 合同中 设置默认工资、缴纳社保和公积金
     */
    @Getter
    @Setter
    @TableField(exist = false)
    HrAgencyContractSalaryEntity hrAgencyContractSalaryEntity;


    /**
     * 合同编号
     */
    @Getter
    @Setter
    private String contractAlias;

    /**
     * ID
     */
    @TableId
    private Integer id;
    /**
     * 机构编号
     */
    private Integer agencyId;
    /**
     * 合同编号
     */
    private String contractNumber;
    /**
     * 合同类型 1 首次 2续签
     */
    private Integer contractType;
    /**
     * 合同状态 0待签约 1成功 2 解除
     */
    private Integer contractStatus;
    /**
     * 服务费结算方式 1按派遣结算金额 2按派遣人数结算  3按固定金额结算
     */
    private Integer serviceChargeType;

    /**
     * 是否按岗位服务费 1是 0否
     */
    @Getter
    @Setter
    private Integer serviceJobType;


    /**
     * 合同费用
     */
    private BigDecimal contractualIncome;
    /**
     * 管理服务费
     */
    private BigDecimal serviceCharge;
    /**
     * 服务费分类(1：服务费；2：综合经费)
     */
    @Getter
    @Setter
    private Integer serviceChargeCategory;
    /**
     * 每月固定服务费
     */
    @Getter
    @Setter
    private BigDecimal serviceFixedCharge;

    /**
     * 服务费结算金额
     */
    private BigDecimal serviceChargeAmount;



    /**
     * 服务费结算比例
     */
    private BigDecimal serviceChargePercentage;
    /**
     * 服务费单人价格
     */
    private BigDecimal serviceUnitCharge;
    /**
     * 服务人数
     */
    private Integer serviceNumber;


//	/**
//	 * 合同生效时间
//	 */
//	@JSONField(format="yyyy-MM-dd")
//	private Date contractEffectDate;

    /**
     * 合同签订时间
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date contractSignDate;
    /**
     * 合同期限(月)
     */
    @JSONField(format = "yyyy-MM-dd")
    private BigDecimal contractPeriod;
    /**
     * 合同开始日期
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date contractStartDate;
    /**
     * 合同结束日期
     */
    @JSONField(format = "yyyy-MM-dd")
    private Date contractEndDate;
    /**
     * 派遣人员数据确认时间
     */
    private Integer employeeDataConfirmDate;
    /**
     * 结算单确认时间
     */
    private Integer statementConfirmDate;
    /**
     * 付款时间
     */
    private Integer makePaymentDate;
    /**
     * 发工资时间
     */
    private Integer paySalaryDate;
    /**
     * 是否要求尽快发放 1是 0否
     */
    private Integer payFast;
    /**
     *
     */
    private String signReferee;
    /**
     * 备注
     */
    private String remark;


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
     * 设置：机构编号
     */
    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    /**
     * 获取：机构编号
     */
    public Integer getAgencyId() {
        return agencyId;
    }

    /**
     * 设置：合同编号
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    /**
     * 获取：合同编号
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * 设置：合同类型 1 首次 2续签
     */
    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    /**
     * 获取：合同类型 1 首次 2续签
     */
    public Integer getContractType() {
        return contractType;
    }

    /**
     * 设置：合同状态 0待签约 1成功 2 解除
     */
    public void setContractStatus(Integer contractStatus) {
        this.contractStatus = contractStatus;
    }

    /**
     * 获取：合同状态 0待签约 1成功 2 解除
     */
    public Integer getContractStatus() {
        return contractStatus;
    }

    /**
     * 设置：服务费结算方式 1按派遣结算金额 2按派遣人数结算
     */
    public void setServiceChargeType(Integer serviceChargeType) {
        this.serviceChargeType = serviceChargeType;
    }

    /**
     * 获取：服务费结算方式 1按派遣结算金额 2按派遣人数结算  3按固定月服务费结算
     */
    public Integer getServiceChargeType() {
        return serviceChargeType;
    }

    /**
     * 设置：合同费用
     */
    public void setContractualIncome(BigDecimal contractualIncome) {
        this.contractualIncome = contractualIncome;
    }

    /**
     * 获取：合同费用
     */
    public BigDecimal getContractualIncome() {
        return contractualIncome;
    }

    /**
     * 设置：管理服务费
     */
    public void setServiceCharge(BigDecimal serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    /**
     * 获取：管理服务费
     */
    public BigDecimal getServiceCharge() {
        return serviceCharge;
    }

    /**
     * 设置：服务费结算金额
     */
    public void setServiceChargeAmount(BigDecimal serviceChargeAmount) {
        this.serviceChargeAmount = serviceChargeAmount;
    }

    /**
     * 获取：服务费结算金额
     */
    public BigDecimal getServiceChargeAmount() {
        return serviceChargeAmount;
    }

    /**
     * 设置：服务费结算比例
     */
    public void setServiceChargePercentage(BigDecimal serviceChargePercentage) {
        this.serviceChargePercentage = serviceChargePercentage;
    }

    /**
     * 获取：服务费结算比例
     */
    public BigDecimal getServiceChargePercentage() {
        return serviceChargePercentage;
    }

    /**
     * 设置：服务费单人价格
     */
    public void setServiceUnitCharge(BigDecimal serviceUnitCharge) {
        this.serviceUnitCharge = serviceUnitCharge;
    }

    /**
     * 获取：服务费单人价格
     */
    public BigDecimal getServiceUnitCharge() {
        return serviceUnitCharge;
    }

    /**
     * 设置：服务人数
     */
    public void setServiceNumber(Integer serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    /**
     * 获取：服务人数
     */
    public Integer getServiceNumber() {
        return serviceNumber;
    }

    /**
     * 设置：合同签订时间
     */
    public void setContractSignDate(Date contractSignDate) {
        this.contractSignDate = contractSignDate;
    }

    /**
     * 获取：合同签订时间
     */
    public Date getContractSignDate() {
        return contractSignDate;
    }

    /**
     * 设置：合同期限(月)
     */
    public void setContractPeriod(BigDecimal contractPeriod) {
        this.contractPeriod = contractPeriod;
    }

    /**
     * 获取：合同期限(月)
     */
    public BigDecimal getContractPeriod() {
        return contractPeriod;
    }

    /**
     * 设置：合同开始日期
     */
    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    /**
     * 获取：合同开始日期
     */
    public Date getContractStartDate() {
        return contractStartDate;
    }

    /**
     * 设置：合同结束日期
     */
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /**
     * 获取：合同结束日期
     */
    public Date getContractEndDate() {
        return contractEndDate;
    }

    /**
     * 设置：派遣人员数据确认时间
     */
    public void setEmployeeDataConfirmDate(Integer employeeDataConfirmDate) {
        this.employeeDataConfirmDate = employeeDataConfirmDate;
    }

    /**
     * 获取：派遣人员数据确认时间
     */
    public Integer getEmployeeDataConfirmDate() {
        return employeeDataConfirmDate;
    }

    /**
     * 设置：结算单确认时间
     */
    public void setStatementConfirmDate(Integer statementConfirmDate) {
        this.statementConfirmDate = statementConfirmDate;
    }

    /**
     * 获取：结算单确认时间
     */
    public Integer getStatementConfirmDate() {
        return statementConfirmDate;
    }

    /**
     * 设置：付款时间
     */
    public void setMakePaymentDate(Integer makePaymentDate) {
        this.makePaymentDate = makePaymentDate;
    }

    /**
     * 获取：付款时间
     */
    public Integer getMakePaymentDate() {
        return makePaymentDate;
    }

    /**
     * 设置：发工资时间
     */
    public void setPaySalaryDate(Integer paySalaryDate) {
        this.paySalaryDate = paySalaryDate;
    }

    /**
     * 获取：发工资时间
     */
    public Integer getPaySalaryDate() {
        return paySalaryDate;
    }

    /**
     * 设置：是否要求尽快发放 1是 0否
     */
    public void setPayFast(Integer payFast) {
        this.payFast = payFast;
    }

    /**
     * 获取：是否要求尽快发放 1是 0否
     */
    public Integer getPayFast() {
        return payFast;
    }

    /**
     * 设置：
     */
    public void setSignReferee(String signReferee) {
        this.signReferee = signReferee;
    }

    /**
     * 获取：
     */
    public String getSignReferee() {
        return signReferee;
    }

    /**
     * 设置：备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取：备注
     */
    public String getRemark() {
        return remark;
    }

//	public Date getContractEffectDate() {
//		return contractEffectDate;
//	}
//
//	public void setContractEffectDate(Date contractEffectDate) {
//		this.contractEffectDate = contractEffectDate;
//	}

}
