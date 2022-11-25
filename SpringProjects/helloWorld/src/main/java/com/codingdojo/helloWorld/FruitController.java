package com.codingdojo.helloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FruitController {
	@RequestMapping("/fruits")
	public String index2(Model model) {
		model.addAttribute("fruit", "Blueberry");
		return "demo.jsp";
	}
}
