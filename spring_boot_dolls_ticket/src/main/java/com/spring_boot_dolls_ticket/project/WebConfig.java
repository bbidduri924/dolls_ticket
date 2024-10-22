package com.spring_boot_dolls_ticket.project;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/ticket_images/**").addResourceLocations("file:///Users/dlwlgus/springBootWorkspace/ticket_images/");
		registry.addResourceHandler("/image/**").addResourceLocations("file:///Users/dlwlgus/springBootWorkspace/upload/"); // 한 개 절대 경로에 여러 url 매핑 가능
    }
	
}
