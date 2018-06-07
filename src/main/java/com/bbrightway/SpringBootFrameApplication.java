package com.bbrightway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = "com.bbrightway")
@MapperScan("com.bbrightway.**/repository/**")
@EnableSwagger2
public class SpringBootFrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFrameApplication.class, args);
	}
}
