/**
 * 
 */
package com.brujulasolutions.sample.app_structure.launchers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

/**
 * @author Tomas
 *
 */
@Configuration
@SpringBootApplication (scanBasePackages = {"com.brujulasolutions.sample.app_structure.spring.di.configuration",
																						"com.brujulasolutions.sample.app_structure.spring.struts.configuration"})
public class StrutsLauncher extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StrutsLauncher.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(StrutsLauncher.class, args);
	}
}