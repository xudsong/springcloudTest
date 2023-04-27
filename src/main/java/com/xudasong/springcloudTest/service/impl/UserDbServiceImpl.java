package com.xudasong.springcloudTest.service.impl;

import com.xudasong.springcloudTest.entity.UserDb;
import com.xudasong.springcloudTest.mapper.UserDbDao;
import com.xudasong.springcloudTest.service.IUserDbService;
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
public class UserDbServiceImpl extends ServiceImpl<UserDbDao, UserDb> implements IUserDbService {

}
