package com.subatech.importtest.springcore.add.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subatech.springcore.model.Address;

@Configuration
public class AddConfig {

	@Bean
	public Address address() {
		Address add = new Address();
		add.setCity("Dhanbad");
		add.setLane("Lane 2");
		add.setState("Jharkhand");
		return add;
	}
}
