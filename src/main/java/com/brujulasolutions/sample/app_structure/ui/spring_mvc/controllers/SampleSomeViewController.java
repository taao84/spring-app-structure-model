/**
 * 
 */
package com.brujulasolutions.sample.app_structure.ui.spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tomas
 *
 */
@Controller
public class SampleSomeViewController {

	@GetMapping("/someview")
	String getSomeView(Model model) {
		model.addAttribute("data", "This is a data generated from a second Spring Controller");
		return "pages/someview.html";
	}
}
