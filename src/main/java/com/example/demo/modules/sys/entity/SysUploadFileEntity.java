package com.example.demo.modules.sys.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-06-26 14:10:48
 */
@TableName("sys_upload_file")
public class SysUploadFileEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Integer id;
	/**
	 * 表ID
	 */
	private Integer tabId;
	/**
	 * 文件名
	 */
	private String fileName;
	/**
	 * 文件后缀
	 */
	private Integer fileSuffix;
	/**
	 * 文件路径
	 */
	private String fileUrl;

    /**
     *  公司服务器文件路径
     */
    @Getter
    @Setter
    private String localFileUrl;

	/**
	 * 访问的文件路径
	 */
	@TableField(exist = false)
	private String fileUrlView;



	/**
	 * 创建者
	 */
	@Getter
	@Setter
	private Long createUser;
	/**
	 * 创建时间
	 */
	@Getter
	@Setter
	private Date createTime;
	/**
	 * 修改者
	 */
	@Getter
	@Setter
	private Long updateUser;
	/**
	 * 修改时间
	 */
	@Getter
	@Setter
	private Date updateTime;


	/**
	 * 类型 1学历 2学位 3教师资格证
	 */
	private Integer type;

	/**
	 * 设置：id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：表ID
	 */
	public void setTabId(Integer tabId) {
		this.tabId = tabId;
	}
	/**
	 * 获取：表ID
	 */
	public Integer getTabId() {
		return tabId;
	}
	/**
	 * 设置：文件名
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * 获取：文件名
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * 设置：文件后缀
	 */
	public void setFileSuffix(Integer fileSuffix) {
		this.fileSuffix = fileSuffix;
	}
	/**
	 * 获取：文件后缀
	 */
	public Integer getFileSuffix() {
		return fileSuffix;
	}
	/**
	 * 设置：文件路径
	 */
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	/**
	 * 获取：文件路径
	 */
	public String getFileUrl() {
		return fileUrl;
	}
	/**
	 * 设置：类型 1学历 2学位 3教师资格证
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：类型 1学历 2学位 3教师资格证
	 */
	public Integer getType() {
		return type;
	}

	public String getFileUrlView() {
		return fileUrlView;
	}

	public void setFileUrlView(String fileUrlView) {
		this.fileUrlView = fileUrlView;
	}
}
