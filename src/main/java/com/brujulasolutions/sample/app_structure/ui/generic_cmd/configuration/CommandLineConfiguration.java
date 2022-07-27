/**
 * 
 */
package com.brujulasolutions.sample.app_structure.ui.generic_cmd.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.brujulasolutions.sample.app_structure.core.services.IHomeService;
import com.brujulasolutions.sample.app_structure.ui.generic_cmd.screens.CommandLineScreen;

/**
 * @author Tomas
 *
 */
@Configuration
public class CommandLineConfiguration {

	@Autowired
	IHomeService homeService;
	
	@Bean
	CommandLineScreen commandLineScreen() {
		return new CommandLineScreen(homeService);
	}
}
