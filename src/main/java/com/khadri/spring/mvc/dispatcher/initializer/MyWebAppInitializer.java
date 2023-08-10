package com.khadri.spring.mvc.dispatcher.initializer;

import javax.servlet.Filter;

import org.springframework.web.filter.FormContentFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.khadri.spring.mvc.config.AppConfig;
import com.khadri.spring.mvc.filter.ExceptionFilter;

public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] { new ExceptionFilter(),new FormContentFilter() };
	}

}
