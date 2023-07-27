package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext  context= SpringApplication.run(Demo1Application.class, args);
		
	alien a = context.getBean(alien.class);
	alien ab= context.getBean(alien.class);
		a.setAname("vansh");
		a.show();
		System.out.println(a.getAname());
		
		System.out.println("wecome to boot " );
	}

}
