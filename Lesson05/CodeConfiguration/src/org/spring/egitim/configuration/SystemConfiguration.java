package org.spring.egitim.configuration;

import org.spring.egitim.system.SecurityController;
import org.spring.egitim.system.SystemConstants;
import org.spring.egitim.system.UserValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SystemConfiguration {

	@Bean
	@Scope("singleton")
	public SystemConstants getSystemConstants() {
		return new SystemConstants();
	}

	@Bean
	public SecurityController getSecurityController() {
		return new SecurityController(getUserValidator());
	}

	@Bean
	public UserValidator getUserValidator() {
		return new UserValidator();
	}

}
