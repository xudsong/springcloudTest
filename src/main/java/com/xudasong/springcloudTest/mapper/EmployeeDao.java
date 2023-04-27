package com.xudasong.springcloudTest.mapper;

import com.xudasong.springcloudTest.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author tingdian
 * @since 2023-04-27
 */
@Mapper
public interface EmployeeDao extends BaseMapper<Employee> {

}
