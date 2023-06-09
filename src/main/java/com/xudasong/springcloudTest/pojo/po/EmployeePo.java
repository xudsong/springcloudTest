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
@TableName("employee")
@ApiModel(value = "Employee对象", description = "")
public class EmployeePo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("age")
    private Integer age;

    @TableField("sal")
    private String sal;

    @TableField("address")
    private String address;


}
