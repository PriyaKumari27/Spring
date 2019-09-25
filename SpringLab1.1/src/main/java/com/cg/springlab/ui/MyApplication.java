package com.cg.springlab.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springlab.service.Employee;



public class MyApplication {
	
	public static void main(String[] args) {


	ApplicationContext app=new ClassPathXmlApplicationContext("spring.xml");
	
	Employee data =(Employee) app.getBean("emp");
	data.getData();

  }
}
