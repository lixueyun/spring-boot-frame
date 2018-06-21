/**
 * Project Name:standard-web
 * File Name:UserEntity
 * Package Name:com.bbrightway.user.domain.entity
 * Date:2018/6/1 10:52
 * Copyright (c) 2018, 北京名道恒通信息技术有限公司 All Rights Reserved.
 */
package com.bbrightway.user.domain.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * ClassName:  UserEntity
 * Function:   TODO
 * Date:   2018/6/1 10:52
 *
 * @author lixueyun
 * @version 3.0
 */
@Data
public class UserEntity {

    private int id;

    private String username;

    private int age;

    @JSONField(format = "yyyy-MM-dd")
    private Date ctm;
}
