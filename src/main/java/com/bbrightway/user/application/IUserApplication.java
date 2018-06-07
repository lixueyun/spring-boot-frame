/**
 * Project Name:standard-web
 * File Name:IUserApplication
 * Package Name:com.bbrightway.user.application
 * Date:2018/6/1 11:13
 * Copyright (c) 2018, 北京名道恒通信息技术有限公司 All Rights Reserved.
 */
package com.bbrightway.user.application;

import com.bbrightway.user.domain.entity.UserEntity;

import java.util.List;

/**
 * ClassName:  IUserApplication
 * Function:   TODO
 * Date:   2018/6/1 11:13
 *
 * @author lixueyun
 * @version 3.0
 */
public interface IUserApplication {

    UserEntity getUserById(Integer id);

    List<UserEntity> getUserList();

    int add(UserEntity user);

    int update(Integer id, UserEntity user);

    int delete(Integer id);
}
