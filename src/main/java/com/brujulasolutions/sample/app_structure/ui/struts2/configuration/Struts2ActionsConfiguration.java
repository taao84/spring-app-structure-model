/**
 * 
 */
package com.brujulasolutions.sample.app_structure.ui.struts2.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.brujulasolutions.sample.app_structure.core.services.IHomeService;
import com.brujulasolutions.sample.app_structure.ui.struts2.actions.HelloAction;

/**
 * @author Tomas
 *
 */
@Configuration
public class Struts2ActionsConfiguration {

	@Autowired
	IHomeService homeService;
	
	@Bean
	HelloAction helloAction() {
		return new HelloAction(homeService);
	}
}
