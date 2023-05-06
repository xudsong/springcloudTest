package com.xudasong.springcloudTest.pojo.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tingdian
 * @since 2023-04-27
 */
@Getter
@Setter
@TableName("dept")
@ApiModel(value = "Dept对象", description = "")
public class DeptPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    @TableField("dept")
    private String dept;

    @TableField("fac_id")
    private Integer facId;


}
