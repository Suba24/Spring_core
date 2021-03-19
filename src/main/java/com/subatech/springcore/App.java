package com.subatech.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subatech.springcore.config.EmpConfig;
import com.subatech.springcore.model.Employee;

public class App {
    public static void main( String[] args ){

    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmpConfig.class);
    	//context.refresh();
    	Employee employee = context.getBean(Employee.class);
    
    	System.out.println(employee);
    }
}
