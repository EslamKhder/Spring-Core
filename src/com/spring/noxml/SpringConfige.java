package com.spring.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:data.properties")
@ComponentScan("com.spring.noxml")
public class SpringConfige {
	
	/*@Bean
	public MasterInterface myMaster() {
		//Master ms = new Master();
		return new Master(mysport());
	}
	
	@Bean
	public SportInterface mysport() {
		return new Football();
	}*/
}
