package com.spring.mvc.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.spring.mvc.context")
@Configuration
public class DiAppConfig {
		@Bean
		public DiConnectionEx diconnectionEx(){
			return new DiConnectionEx();
		}

}
