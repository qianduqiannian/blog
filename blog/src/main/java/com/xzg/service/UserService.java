package com.xzg.service;

import com.xzg.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
