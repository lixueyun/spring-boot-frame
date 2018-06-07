/**
 * Project Name:standard-web
 * File Name:SwaggerConfig
 * Package Name:com.bbrightway.config
 * Date:2018/4/24 10:53
 * Copyright (c) 2018, 北京名道恒通信息技术有限公司 All Rights Reserved.
 */
package com.bbrightway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName:  SwaggerConfig
 * Function:   TODO
 * Date:   2018/4/24 10:53
 *
 * @author lixueyun
 * @version 3.0
 */
@Configuration
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bbrightway"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("XX项目后台API文档")
                .description("")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
}
