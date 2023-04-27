package com.xudasong.springcloudTest.service.impl;

import com.xudasong.springcloudTest.entity.UserDb;
import com.xudasong.springcloudTest.mapper.UserDbMapper;
import com.xudasong.springcloudTest.service.UserDbService;
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
public class UserDbServiceImpl extends ServiceImpl<UserDbMapper, UserDb> implements UserDbService {

}
