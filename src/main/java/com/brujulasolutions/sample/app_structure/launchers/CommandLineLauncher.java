/**
 * 
 */
package com.brujulasolutions.sample.app_structure.launchers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.brujulasolutions.sample.app_structure.ui.generic_cmd.screens.CommandLineScreen;

/**
 * This example only uses Spring Dependency inyection, but nothing else.
 * 
 * @author Tomas
 *
 */
@Configuration
@SpringBootApplication(scanBasePackages = { "com.brujulasolutions.sample.app_structure.app.di.configuration",
    																				"com.brujulasolutions.sample.app_structure.spring.generic_cmd.configuration" })
public class CommandLineLauncher {

	@Autowired
	private CommandLineScreen commandLineScreen;

	public static void main(String[] args) {
		SpringApplication.run(CommandLineLauncher.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			commandLineScreen.runScreenLoop();
		};
	}
}
