package com.ahpu.service;

import com.ahpu.model.Users;

/**
 * Created by x on 2017/11/27.
 */
public interface UserService {
    Users selectByPrimaryKey(Integer id);
}
