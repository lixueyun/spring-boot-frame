/**
 * Project Name:spring-boot-frame
 * File Name:EmailConfiguration
 * Package Name:com.bbrightway.config
 * Date:2018/6/21 19:48
 * Copyright (c) 2018, 北京名道恒通信息技术有限公司 All Rights Reserved.
 */
package com.bbrightway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * ClassName:  EmailConfiguration
 * Function:   TODO
 * Date:   2018/6/21 19:48
 *
 * @author lixueyun
 * @version 3.0
 */
@Configuration
@PropertySource(value = "classpath:conf/${profiles-active}/Email.properties")//在yml中配置之后不需要此扫描路径
public class EmailConfiguration {
}
