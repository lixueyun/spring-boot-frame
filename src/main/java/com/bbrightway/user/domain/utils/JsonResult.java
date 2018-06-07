/**
 * Project Name:standard-web
 * File Name:JsonResult
 * Package Name:com.bbrightway.user.domain.utils
 * Date:2018/6/1 11:16
 * Copyright (c) 2018, 北京名道恒通信息技术有限公司 All Rights Reserved.
 */
package com.bbrightway.user.domain.utils;

import lombok.Data;

/**
 * ClassName:  JsonResult
 * Function:   TODO
 * Date:   2018/6/1 11:16
 *
 * @author lixueyun
 * @version 3.0
 */
@Data
public class JsonResult {
    private String status = null;

    private Object result = null;

    public JsonResult status(String status) {
        this.status = status;
        return this;
    }
}
