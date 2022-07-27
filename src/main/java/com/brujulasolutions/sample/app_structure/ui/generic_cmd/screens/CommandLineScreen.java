/**
 * 
 */
package com.brujulasolutions.sample.app_structure.ui.generic_cmd.screens;

import java.io.IOException;
import java.util.Scanner;

import com.brujulasolutions.sample.app_structure.core.services.IHomeService;

/**
 * @author Tomas
 *
 */
public class CommandLineScreen {

	IHomeService homeService;

	public CommandLineScreen(IHomeService homeService) {
		this.homeService = homeService;
	}

	void displayOptions() {
		System.out.printf("####################################################\n");
		System.out.printf("\t\t%s", "Main menu\n");
		System.out.printf("\t\t%s", "1. Get data from Home Service\n");
		System.out.printf("\t\t%s", "2. Exit\n");
		System.out.printf("####################################################\n");
		System.out.printf("Enter your option> ");
	}

	public static void clearScreen() {
		System.out.println(System.lineSeparator().repeat(50));
	}

	public void runScreenLoop() throws IOException {
		String name = "";
		try (Scanner scanner = new Scanner(System.in)) {
			while (!name.equals("2")) {
				displayOptions();
				name = scanner.next();
				switch (name) {
				case "1":
					System.out.printf("Service Response> %s \n", homeService.getHomeData().toString());
					break;
				case "2":
					System.exit(0);
				default:
					break;
				}
				System.in.read();
				clearScreen();
			}
		}
		System.out.printf("Program finished");
	}
}
