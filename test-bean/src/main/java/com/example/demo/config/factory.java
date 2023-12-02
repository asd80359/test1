package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.abc;
import com.example.demo.service.imlp.test1;
import com.example.demo.service.imlp.test2;
/*
 * @Configuration與@Bean搭配工廠模式
 * 先用c做一個大的class裡，多個b的方法
 * 若有super，要用父類別-異質宣告
 * 
 * */

@Configuration
public class factory {
	@Bean
	public abc gettest1()
	{
		return new test1();
	}
	@Bean
	public abc gettest2()
	{
		return new test2();
	}
}
