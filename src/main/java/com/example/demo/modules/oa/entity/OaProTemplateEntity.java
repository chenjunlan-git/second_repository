package com.example.demo.modules.oa.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 流程模板
 * </p>
 *
 * @author angy
 * @since 2019-06-22
 */
@Data
@TableName("oa_pro_template")
public class OaProTemplateEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    private Integer id;

    /**
     * 流程名称
     */
    private String proName;

    /**
     * 流程定义键名称
     */
    private String proDefineKey;

    /**
     * 流程模板类型 0：请假类型
     */
    private Integer type;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;


}
