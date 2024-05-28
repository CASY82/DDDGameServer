package com.study.futurelab.application.config;

import java.io.IOException;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;

/**
 * 정적 리소스 핸들러
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
			"classpath:/resources/",
			"classpath:/templates/",
			"classpath:/META-INF/resources/",
			"classpath:/static/",
			"classpath:/public/"
	};
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/").resourceChain(true);
		registry.addResourceHandler("/**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS).resourceChain(true);
		registry.addResourceHandler("/**")
			.addResourceLocations("classpath:/static/")
			.resourceChain(true);
// SPA 설정
//			.addResolver(new PathResourceResolver() {
//				@Override
//				protected Resource getResource(String resourcePath, Resource location) throws IOException {
//					Resource reqResource = location.createRelative(resourcePath);
//					return reqResource.exists() && reqResource.isReadable() ? reqResource : new ClassPathResource("/static/index.html");
//				}
//			});
	}
}
