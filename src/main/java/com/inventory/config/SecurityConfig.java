package com.inventory.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig implements WebSecurityConfigurer<WebSecurity>{

	@Override
	public void init(WebSecurity builder) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configure(WebSecurity builder) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}
