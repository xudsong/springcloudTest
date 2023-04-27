package com.xudasong.springcloudTest.service.impl;

import com.xudasong.springcloudTest.entity.Employee;
import com.xudasong.springcloudTest.mapper.EmployeeMapper;
import com.xudasong.springcloudTest.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xudasong
 * @since 2023-04-27
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
