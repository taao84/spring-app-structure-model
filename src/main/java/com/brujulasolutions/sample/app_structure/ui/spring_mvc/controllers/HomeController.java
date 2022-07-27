package com.brujulasolutions.sample.app_structure.ui.spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.brujulasolutions.sample.app_structure.core.services.IHomeService;

@Controller
public class HomeController {

	private IHomeService homeService;
	
	HomeController(IHomeService homeService) {
		this.homeService = homeService;
	}
	
	@GetMapping ("/")
	public String index(Model model) {
		model.addAttribute("data", homeService.getHomeData());
		return "index.html";
	}
}
