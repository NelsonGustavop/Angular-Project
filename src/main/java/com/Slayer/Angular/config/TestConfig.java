package com.Slayer.Angular.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Slayer.Angular.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbServices;

	@Bean
	public void instanciaDB() {
		this.dbServices.instanciaDB();
	}
}
