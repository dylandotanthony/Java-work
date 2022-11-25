package com.codingdojo.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HomeController {

	@RequestMapping("")
	public String index() {
		return "Hellow World";
	}
	
	@RequestMapping("/world")
		public String world() {
			return "Class Level annotations are cool!";
	}
	
	@RequestMapping("/search")
	public String search(@RequestParam(value="q", required=false) String searchquery) {
		if (searchquery == null) {
			return " You Searched for: Nothing" ;
		}else
		return "You searched for: " + searchquery;
	}
	
}
