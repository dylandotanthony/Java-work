package com.codingdojo.dojoNinja.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.dojoNinja.models.Dojo;
import com.codingdojo.dojoNinja.models.Ninja;
import com.codingdojo.dojoNinja.repositories.DojoRepository;
import com.codingdojo.dojoNinja.repositories.NinjaRepository;

@Service
public class DojoNinjaService {
	
	
	private DojoRepository dojoRepo;
	
	private NinjaRepository ninjaRepo;
	
	public DojoNinjaService(DojoRepository dojoRepo, NinjaRepository ninjaRepo) {
		this.dojoRepo = dojoRepo;
		this.ninjaRepo = ninjaRepo;
	}
	public void addDojo(Dojo dojo) {
		dojoRepo.save(dojo);
	}
	public List<Dojo> allDojos() {
		return (List<Dojo>) dojoRepo.findAll();
	}
	public void addNinja(Ninja ninja) {
		ninjaRepo.save(ninja);
	}
	public List<Ninja> allNinjas() {
		return (List<Ninja>) ninjaRepo.findAll();
	}
	public Dojo findDojo(Long id) {
		return dojoRepo.findOne(id);
	}
	public Ninja findNinja(Long id) {
		return ninjaRepo.findOne(id);
	}
}
