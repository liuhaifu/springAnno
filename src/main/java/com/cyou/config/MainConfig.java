package com.cyou.config;


import com.cyou.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@ComponentScan(basePackages = "com.cyou",includeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,
				value = {Service.class,Controller.class})},
		useDefaultFilters = false)
@Configuration
public class MainConfig {
	// @Bean注解是给IOC容器中注册一个bean，类型自然就是返回值的类型，id默认是用方法名作为id
	@Bean("person02")
	public Person person01() {
		return new Person("liayun", 20);
	}
}
