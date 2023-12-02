package com.example.demo.service.imlp;

import org.springframework.stereotype.Component;

import com.example.demo.service.abc;
@Component
public class test1 implements abc{

	@Override
	public void show() {
		System.out.println("test1 Component");
		
	}

}
