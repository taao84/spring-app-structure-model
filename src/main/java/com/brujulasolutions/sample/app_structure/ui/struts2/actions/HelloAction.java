/**
 * 
 */
package com.brujulasolutions.sample.app_structure.ui.struts2.actions;

import com.brujulasolutions.sample.app_structure.core.services.IHomeService;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	private static final long serialVersionUID = -4591027295473592455L;

	private IHomeService homeService;

	public HelloAction(IHomeService homeService) {
		this.homeService = homeService;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(homeService.getHomeData().toString());
		return "success";
	}
}