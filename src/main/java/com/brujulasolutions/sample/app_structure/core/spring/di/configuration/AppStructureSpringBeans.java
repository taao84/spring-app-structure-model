/**
 * 
 */
package com.brujulasolutions.sample.app_structure.core.spring.di.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.brujulasolutions.sample.app_structure.core.persistence.repository.IPersonCrudRepository;
import com.brujulasolutions.sample.app_structure.core.services.IHomeService;
import com.brujulasolutions.sample.app_structure.core.services.impl.HomeServiceDatabaseImpl;

/**
 * @author Tomas
 *
 */
@Configuration
@ComponentScan (basePackages = "com.brujulasolutions.sample.app_structure.core.spring.data.configuration")
@EntityScan (basePackages = {
		"com.brujulasolutions.sample.app_structure.core.persistence.model"
})
@EnableJpaRepositories (basePackages = {
		"com.brujulasolutions.sample.app_structure.core.persistence"
}) 
public class AppStructureSpringBeans {

	@Bean
	IHomeService homeService(IPersonCrudRepository personRepository) {
//		return new HomeServiceMockDataImpl();
		return new HomeServiceDatabaseImpl(personRepository);
	}
}
