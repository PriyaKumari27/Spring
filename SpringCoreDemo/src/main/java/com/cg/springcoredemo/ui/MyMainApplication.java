package com.cg.springcoredemo.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcoredemo.dto.Product;
import com.cg.springcoredemo.service.ProductService;

public class MyMainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
		ProductService productservice =(ProductService) app.getBean("productservice");
		
	//	ProductService productservice = null ;
		Product pro=(Product) app.getBean("prod");
		
		pro.setProdId(1001);
		pro.setProdName("Mobile");
		
		productservice.addProduct(pro);

	}

}
