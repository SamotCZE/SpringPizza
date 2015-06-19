package com.springinaction.pizza.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hudectom on 24.4.2015.
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String redirectToFlow() {
		return "redirect:/pizza";
	}
}
