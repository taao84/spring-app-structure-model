/**
 * 
 */
package com.brujulasolutions.sample.app_structure.ui.struts2.configuration;

import javax.servlet.DispatcherType;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tomas
 *
 */
@Configuration
public class Struts2Configuration {
	
	@Bean
	public FilterRegistrationBean<StrutsPrepareAndExecuteFilter> someFilterRegistration() {
		FilterRegistrationBean<StrutsPrepareAndExecuteFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new StrutsPrepareAndExecuteFilter());
		registration.addUrlPatterns("*.action");
		registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
		registration.setName("StrutsPrepareAndExecuteFilter");
		return registration;
	}
}