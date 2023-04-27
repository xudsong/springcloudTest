package com.xudasong.springcloudTest.service.impl;

import com.xudasong.springcloudTest.entity.Employee;
import com.xudasong.springcloudTest.mapper.EmployeeDao;
import com.xudasong.springcloudTest.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tingdian
 * @since 2023-04-27
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, Employee> implements IEmployeeService {

}
