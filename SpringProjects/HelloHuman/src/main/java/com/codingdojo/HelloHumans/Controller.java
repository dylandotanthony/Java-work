package com.codingdojo.HelloHumans;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/")
	public String search
	(@RequestParam(value="name", required=false) String searchquery, 
	@RequestParam(value="last_name", required=false) String searchq,
	@RequestParam(value="times", required=false, defaultValue="1") Integer timez) {
		System.out.println(timez);
		if (searchquery == null ) {
			return "Hello Human" ;
		}else if (searchq == null ) {
			return "Hello " + searchquery;
		} else {
			return ("Hello " + searchquery + "  " + searchq).repeat(timez);
		} 
	}
}
