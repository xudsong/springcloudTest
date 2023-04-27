package com.xudasong.springcloudTest.service.impl;

import com.xudasong.springcloudTest.entity.Dept;
import com.xudasong.springcloudTest.mapper.DeptDao;
import com.xudasong.springcloudTest.service.IDeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptDao, Dept> implements IDeptService {

}
