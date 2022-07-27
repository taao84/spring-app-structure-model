/**
 * 
 */
package com.brujulasolutions.sample.app_structure.launchers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Tomas
 *
 */
@SpringBootApplication (scanBasePackages = {"com.brujulasolutions.sample.app_structure.core.spring.di.configuration",
																						"com.brujulasolutions.sample.app_structure.ui.spring_mvc.controllers"})
public class SpringMvcLauncher {

  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(SpringMvcLauncher.class);
    app.run(args);
  }
}

