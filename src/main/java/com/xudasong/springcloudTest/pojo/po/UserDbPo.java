package com.xudasong.springcloudTest.pojo.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

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
@TableName("user_db")
@ApiModel(value = "UserDb对象", description = "")
public class UserDbPo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @TableField("username")
    private String username;

    @TableField("sex")
    private String sex;

    @TableField("birthday")
    private Date birthday;

    @TableField("address")
    private String address;


}
