package com.codingdojo.omikujiForm.application.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class omikujiFormController {

	@GetMapping("/")
	public String dash() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String index(HttpSession session) {
		return "index.jsp";
	}
	
//	@RequestMapping(value="/new", method=RequestMethod.POST)
//	public String news(
//			@RequestParam(value="numbers") int numbers,
//			@RequestParam(value="city") String city,
//			@RequestParam(value="name") String name,
//			@RequestParam(value="interest") String interest,
//			@RequestParam(value="living") String living,
//			@RequestParam(value="something") String something) {
//		return "redirect:/omikuji/show";
//	}
	
	@PostMapping("/new")
	public String newdata(
			@RequestParam(value="numbers") int numbers,
			@RequestParam(value="city") String city,
			@RequestParam(value="name") String name,
			@RequestParam(value="interest") String interest,
			@RequestParam(value="living") String living,
			@RequestParam(value="something") String something,
			HttpSession session
			) {
			String formResult = String.format(
						"In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.",
						numbers, city, name, interest, living, something);
			System.out.println(numbers);
			session.setAttribute("formResult", formResult);

			
			
		return "redirect:/omikuji/show";
	}
	
	
	@RequestMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		String result = (String) session.getAttribute("formResult");
		model.addAttribute("result", result);

		return "results.jsp";
	}
}
