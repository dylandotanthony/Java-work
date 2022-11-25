package com.codingdojo.dojoNinja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.dojoNinja.models.Dojo;
import com.codingdojo.dojoNinja.models.Ninja;
import com.codingdojo.dojoNinja.services.DojoNinjaService;

@Controller
public class MainController {

	private final DojoNinjaService service;
	public MainController(DojoNinjaService service) {
		this.service = service;
	}
	@RequestMapping("/{id}")
	public String home(@PathVariable("id") Long id, Model model) {
		service.findDojo(id);
		model.addAttribute("dojo", service.findDojo(id));
		model.addAttribute("ninjas", service.findDojo(id).getNinjas());
		return "index.jsp";
	}
	@RequestMapping("/dojos/new")
	public String dojo(@ModelAttribute("newDojo") Dojo dojo) {
		return "dojo.jsp";
	}
	@PostMapping("/dojos/new")
	public String newDojo(@ModelAttribute("newDojo") Dojo dojo) {
		service.addDojo(dojo);
		return "redirect:/dojos/new";
	}
	@RequestMapping("/ninjas/new")
	public String ninja(@ModelAttribute("newNinja") Ninja ninja, Model model) {
		model.addAttribute("dojos", service.allDojos());
		return "ninja.jsp";
	}
	@PostMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("newNinja") Ninja ninja, @RequestParam("dojo") String id) {
		Long number= Long.valueOf(id);
		ninja.setDojo(service.findDojo(number));
		service.addNinja(ninja);
		return "redirect:/ninjas/new";
	}
	
}
