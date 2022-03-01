package com.businessassistantbcn.login.config;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

// Development-only user with ADMIN credentials
@Configuration
@ConfigurationProperties("security.testuser")
@Getter @Setter
public class TestUser {
	
	private String userName;
	private String password;
	
}