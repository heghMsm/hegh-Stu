package com.hgh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hgh.entity.po.User;
import com.hgh.mapper.UserMapper;
import com.hgh.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author hegh
 * @date 2021-05-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
