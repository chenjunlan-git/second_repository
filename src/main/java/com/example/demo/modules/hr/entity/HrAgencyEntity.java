package com.example.demo.modules.hr.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 机构表
 跟公司业务相关的机构表
 *
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-06-11 11:39:47
 */
@TableName("hr_agency")
public class HrAgencyEntity implements Serializable {
    private static final long serialVersionUID = 1L;



    /**
     * 注册号
     */
    private String registrId;



    /**
     * 合同项目类型 1派遣 2委派 3购买  4项目 5特色 99其他
     */
//	private  Integer contractProjectType;


    /**
     * 付款帐号
     */
    @Getter
    @Setter
    @TableField(exist = false)
    private HrAgencyPaymentAccountEntity hrAgencyPaymentAccountEntity;

    /**
     * 机构联系人
     */
    @Getter
    @Setter
    @TableField(exist = false)
    private List<HrAgencyLiaisonEntity> hrAgencyLiaisonEntityList;



    //后五个属性用于加载机构树
    @TableField(exist=false)
    @Getter
    @Setter
    private HrAgencyEntity hrAgencyEntity;

    @TableField(exist=false)
    @Getter
    @Setter
    private List<HrAgencyEntity> hrAgencyEntityList;

    @TableField(exist=false)
    @Getter
    @Setter
    private String  aId;

    @TableField(exist=false)
    @Getter
    @Setter
    private String  aName;

    @TableField(exist=false)
    @Getter
    @Setter
    private String  parentId;

    @TableField(exist=false)
    @Getter
    @Setter
    private String  level;


    /**
     * ID
     */
    @TableId
    private Integer id;
    /**
     * 机构全称
     */
    private String name;
    /**
     * 机构编码
     */
    private String agencyCode;
    /**
     * 法人
     */
    private String legalPerson;
    /**
     * 统一社会信用代码
     */
    private String socialCreditCode;
    /**
     * 地址
     */
    private String address;
    /**
     * 网址
     */
    private String website;
    /**
     * 类型 0为合作单位  1为非合作单位 98集团内部机构 99 教委机构
     */
    private Integer type;
    /**
     * 单位分类 1学校 2医院 3街道办
     */
    private Integer agencyType;
    /**
     * 机构级别  -学校
     */
    private Integer agencyRankSchool;
    /**
     * 机构级别  -医院
     */
    private Integer agencyRankHospital;
    /**
     * 机构性质  1公办 2民办
     */
    private Integer agencyNature;
    /**
     * 单位所在省
     */
    private String province;
    /**
     * 单位所在市
     */
    private String city;
    /**
     * 单位所在区
     */
    private String area;
    /**
     *
     */
    //private String taxpayerIdeNumber;
    /**
     * 手机
     */
    private String agencyPhone;
    /**
     * 单位传真
     */
    private String agencyFax;
    /**
     * 客服ID
     */
    private Integer serviceId;
    /**
     * 法人复印件
     */
    private String legalPersonUrl;
    /**
     * 营业执照复印件
     */
    private String businessLicenseUrl;

    /**
     * 法人复印件
     */
    @TableField(exist=false)
    @Getter
    @Setter
    private String legalPersonUrlView;
    /**
     * 营业执照复印件
     */
    @TableField(exist=false)
    @Getter
    @Setter
    private String businessLicenseUrlView;


    /**
     * 父机构ID
     */
    @Getter
    @Setter
    private Integer parentAgencyId;


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
     * 设置：机构全称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取：机构全称
     */
    public String getName() {
        return name;
    }
    /**
     * 设置：机构编码
     */
    public void setAgencyCode(String agencyCode) {
        this.agencyCode = agencyCode;
    }
    /**
     * 获取：机构编码
     */
    public String getAgencyCode() {
        return agencyCode;
    }
    /**
     * 设置：法人
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }
    /**
     * 获取：法人
     */
    public String getLegalPerson() {
        return legalPerson;
    }
    /**
     * 设置：统一社会信用代码
     */
    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode;
    }
    /**
     * 获取：统一社会信用代码
     */
    public String getSocialCreditCode() {
        return socialCreditCode;
    }
    /**
     * 设置：地址
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * 获取：地址
     */
    public String getAddress() {
        return address;
    }
    /**
     * 设置：网址
     */
    public void setWebsite(String website) {
        this.website = website;
    }
    /**
     * 获取：网址
     */
    public String getWebsite() {
        return website;
    }
    /**
     * 设置：类型 0为合作单位  1为非合作单位 98集团内部机构 99 教委机构
     */
    public void setType(Integer type) {
        this.type = type;
    }
    /**
     * 获取：类型 0为合作单位  1为非合作单位 98集团内部机构 99 教委机构
     */
    public Integer getType() {
        return type;
    }
    /**
     * 设置：单位分类 1学校 2医院 3街道办
     */
    public void setAgencyType(Integer agencyType) {
        this.agencyType = agencyType;
    }
    /**
     * 获取：单位分类 1学校 2医院 3街道办
     */
    public Integer getAgencyType() {
        return agencyType;
    }
    /**
     * 设置：机构级别  -学校
     */
    public void setAgencyRankSchool(Integer agencyRankSchool) {
        this.agencyRankSchool = agencyRankSchool;
    }
    /**
     * 获取：机构级别  -学校
     */
    public Integer getAgencyRankSchool() {
        return agencyRankSchool;
    }
    /**
     * 设置：机构级别  -医院
     */
    public void setAgencyRankHospital(Integer agencyRankHospital) {
        this.agencyRankHospital = agencyRankHospital;
    }
    /**
     * 获取：机构级别  -医院
     */
    public Integer getAgencyRankHospital() {
        return agencyRankHospital;
    }
    /**
     * 设置：机构性质  1公办 2民办
     */
    public void setAgencyNature(Integer agencyNature) {
        this.agencyNature = agencyNature;
    }
    /**
     * 获取：机构性质  1公办 2民办
     */
    public Integer getAgencyNature() {
        return agencyNature;
    }
    /**
     * 设置：单位所在省
     */
    public void setProvince(String province) {
        this.province = province;
    }
    /**
     * 获取：单位所在省
     */
    public String getProvince() {
        return province;
    }
    /**
     * 设置：单位所在市
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * 获取：单位所在市
     */
    public String getCity() {
        return city;
    }
    /**
     * 设置：单位所在区
     */
    public void setArea(String area) {
        this.area = area;
    }
    /**
     * 获取：单位所在区
     */
    public String getArea() {
        return area;
    }
    /**
     * 设置：
     */
//	public void setTaxpayerIdeNumber(String taxpayerIdeNumber) {
//		this.taxpayerIdeNumber = taxpayerIdeNumber;
//	}
    /**
     * 获取：
     */
//	public String getTaxpayerIdeNumber() {
//		return taxpayerIdeNumber;
//	}
    /**
     * 设置：手机
     */
    public void setAgencyPhone(String agencyPhone) {
        this.agencyPhone = agencyPhone;
    }
    /**
     * 获取：手机
     */
    public String getAgencyPhone() {
        return agencyPhone;
    }
    /**
     * 设置：单位传真
     */
    public void setAgencyFax(String agencyFax) {
        this.agencyFax = agencyFax;
    }
    /**
     * 获取：单位传真
     */
    public String getAgencyFax() {
        return agencyFax;
    }
    /**
     * 设置：客服ID
     */
    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }
    /**
     * 获取：客服ID
     */
    public Integer getServiceId() {
        return serviceId;
    }
    /**
     * 设置：法人复印件
     */
    public void setLegalPersonUrl(String legalPersonUrl) {
        this.legalPersonUrl = legalPersonUrl;
    }
    /**
     * 获取：法人复印件
     */
    public String getLegalPersonUrl() {
        return legalPersonUrl;
    }
    /**
     * 设置：营业执照复印件
     */
    public void setBusinessLicenseUrl(String businessLicenseUrl) {
        this.businessLicenseUrl = businessLicenseUrl;
    }
    /**
     * 获取：营业执照复印件
     */
    public String getBusinessLicenseUrl() {
        return businessLicenseUrl;
    }

    public String getRegistrId() {
        return registrId;
    }

    public void setRegistrId(String registrId) {
        this.registrId = registrId;
    }

//	public Integer getContractProjectType() {
//		return contractProjectType;
//	}
//
//	public void setContractProjectType(Integer contractProjectType) {
//		this.contractProjectType = contractProjectType;
//	}
}