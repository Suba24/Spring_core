package com.subatech.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.subatech.importtest.springcore.add.config.AddConfig;
import com.subatech.springcore.model.Address;
import com.subatech.springcore.model.Employee;

@ComponentScan("com.subatech.springcore")
@Import(AddConfig.class)
@Configuration
@PropertySource(value="classpath:app.properties")
public class EmpConfig {

	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		return emp;
	}

	@Bean
	public Address address(){
		return new Address();
	}
	
}
