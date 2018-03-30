/**
 * 
 */
package com.ashish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ashish
 *
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String home() {
		System.out.println("HomeController: Passing through...");
		return "swagger-ui.html";
	}
	
}
