package com.brujulasolutions.sample.app_structure.core.spring.data.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.brujulasolutions.sample.app_structure.core.persistence.model.Person;

@Configuration
public class RepositoryConfiguration implements RepositoryRestConfigurer {

  @Override
  public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
      config.exposeIdsFor(Person.class);
  }
}