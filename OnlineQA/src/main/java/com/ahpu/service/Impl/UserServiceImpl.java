package com.ahpu.service.Impl;

import com.ahpu.dao.UsersMapper;
import com.ahpu.model.Users;
import com.ahpu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by x on 2017/11/27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UsersMapper usersMapper;

    public Users selectByPrimaryKey(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }
}
