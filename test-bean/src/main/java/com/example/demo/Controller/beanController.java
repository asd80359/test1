package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.factory;
import com.example.demo.service.abc;
import com.example.demo.service.imlp.test1;
import com.example.demo.service.imlp.test2;

@RestController
public class beanController {
	
	@Autowired
		test1 t1;
	
	@Autowired
		test2 t2;
	
	@Autowired
	@Qualifier("test1")
		abc a;//直接用super，多個sub要用@Qualifier設定("aaa")只能小寫
	
	@Autowired
		factory fa;
	
	@RequestMapping("test1")
	public String gettest1()
	{
		t1.show();
		return "test1 Success";
	}
	
	@RequestMapping("test2")
	public String gettest2()
	{
		t2.show();
		return "test2 Succese";
	}
	@RequestMapping("abc")
	public String getabc()
	{
		a.show();
		return "abc Succese";
	}
	@RequestMapping("factory")
	public String getfactory()
	{
		fa.gettest1().show();
		fa.gettest2().show();
		return "factory Success";
	}
	
	

}
