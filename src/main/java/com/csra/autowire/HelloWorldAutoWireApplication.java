package com.csra.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class HelloWorldAutoWireApplication {

	public static void main(String[] args) {
		//SpringApplication.run(HelloWorldAutoWireApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("app.Config.xml");
		HelloSystem system = context.getBean("systemAutowiredByType",HelloSystem.class);
		System.out.println(system.getWorld().getMyValue());
		
		HelloSystem autoWireByName = context.getBean("systemAutowiredByName",HelloSystem.class); 
		System.out.println(autoWireByName.getHelloWorldModel().getMyValue());
		
		HelloSystem autoWireCtor = context.getBean("systemAutowiredCtor",HelloSystem.class); 
		System.out.println(autoWireCtor.getHelloWorldModel().getMyValue());
		
		HelloSystem autoWireDefault = context.getBean("systemAutowiredDefault",HelloSystem.class); 
		//System.out.println(autoWireDefault.getHelloWorldModel().getMyValue());
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
