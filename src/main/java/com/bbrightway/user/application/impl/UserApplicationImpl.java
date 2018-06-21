/**
 * Project Name:standard-web
 * File Name:UserApplicationImpl
 * Package Name:com.bbrightway.user.application.impl
 * Date:2018/6/1 11:14
 * Copyright (c) 2018, 北京名道恒通信息技术有限公司 All Rights Reserved.
 */
package com.bbrightway.user.application.impl;

import com.bbrightway.user.application.IUserApplication;
import com.bbrightway.user.domain.entity.UserEntity;
import com.bbrightway.user.repository.IUserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:  UserApplicationImpl
 * Function:   TODO
 * Date:   2018/6/1 11:14
 *
 * @author lixueyun
 * @version 3.0
 */
@Service
@Slf4j
public class UserApplicationImpl implements IUserApplication {


    @Autowired
    private IUserDao userDao;

    @Override
    public UserEntity getUserById(Integer id) {
        log.error("根据用户id查询，id:{}",id);
        return userDao.getUserById(id);
    }

    @Override
    public List<UserEntity> getUserList() {
        log.info("查询所用用户信息!");
        return userDao.getUserList();
    }

    @Override
    public int add(UserEntity user) {
        return userDao.add(user);
    }

    @Override
    public int update(Integer id, UserEntity user) {
        return userDao.update(id, user);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }

}
