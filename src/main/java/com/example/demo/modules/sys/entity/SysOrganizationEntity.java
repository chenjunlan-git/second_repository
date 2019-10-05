package com.example.demo.modules.sys.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 
 * 
 * @author heyongjie
 * @email yongjie.he@xfktech.com
 * @date 2018-06-07 19:29:56
 */
@TableName("sys_organization")
public class SysOrganizationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long orgId;
	/**
	 * 父节点ID，0：代表根节点
	 */
	private Long parentId;
	/**
	 * 组织名称
	 */
	private String orgName;
	/**
	 * 排序字段
	 */
	private Integer orderIndex;
	/**
	 * 删除标记 1：已删除  0：正常
	 */
	private Integer delFlag;
	/**
	 * 创建人ID
	 */
	//@JSONField(serialize = false)
	private Long createUserId;
	/**
	 * 创建时间
	 */
	//@JSONField(serialize = false)
	private Date createTime;
	/**
	 * 修改人ID
	 */
	@JSONField(serialize = false)
	private Long updateUserId;
	/**
	 * 修改时间
	 */
	@JSONField(serialize = false)
	private Date updateTime;


	@TableField(exist=false)
	@Getter
	@Setter
	private SysOrganizationEntity SysOrganizationEntity;

	@TableField(exist=false)
	@Getter
	@Setter
	private List<SysOrganizationEntity> sysOrganizationEntityList;

	/**
	 * 父组织名
	 */
	@TableField(exist=false)
	@Getter
	@Setter
	private String parentOrgName;


	//组织对应角色ID集合
	@TableField(exist=false)
	@Getter
	@Setter
	private Long[] roleIds;







	/**
	 * 负责省
	 */
	private String province;

	/**
	 * 负责市
	 */
	private String city;
	/**
	 * 负责区
	 */
	private String area;


	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}



	/**
	 * 设置：
	 */
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	/**
	 * 获取：
	 */
	public Long getOrgId() {
		return orgId;
	}
	/**
	 * 设置：父节点ID，0：代表根节点
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：父节点ID，0：代表根节点
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * 设置：组织名称
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * 获取：组织名称
	 */
	public String getOrgName() {
		return orgName;
	}
	/**
	 * 设置：排序字段
	 */
	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}
	/**
	 * 获取：排序字段
	 */
	public Integer getOrderIndex() {
		return orderIndex;
	}
	/**
	 * 设置：删除标记 -1：已删除  1：正常
	 */
	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}
	/**
	 * 获取：删除标记 -1：已删除  1：正常
	 */
	public Integer getDelFlag() {
		return delFlag;
	}
	/**
	 * 设置：创建人ID
	 */
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * 获取：创建人ID
	 */
	public Long getCreateUserId() {
		return createUserId;
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
	 * 设置：修改人ID
	 */
	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}
	/**
	 * 获取：修改人ID
	 */
	public Long getUpdateUserId() {
		return updateUserId;
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
