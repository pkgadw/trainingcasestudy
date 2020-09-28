package com.training.subscriptions.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.MappedInterceptor;

import com.training.subscriptions.security.interceptor.SecurityInterceptor;

@Configuration													
public class WebConfig implements WebMvcConfigurer {

	@Bean
	public MappedInterceptor interceptor(SecurityInterceptor securityInterceptor) {
		return new MappedInterceptor(new String[] { "/**" }, securityInterceptor);
	}
}
