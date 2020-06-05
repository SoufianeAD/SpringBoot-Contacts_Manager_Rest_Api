package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Entreprise;
import com.example.demo.repositories.EntrepriseRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/entreprise")
public class EntrepriseController {
	
	@Autowired
	private EntrepriseRepository entrepriseRepository;
	
	@PostMapping("/add")
	public Entreprise add(@RequestBody Entreprise entreprise) {
		return entrepriseRepository.save(entreprise);
	}
	
	@PutMapping("/update")
	public Entreprise update(@RequestBody Entreprise entreprise) {
		return entrepriseRepository.save(entreprise);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		entrepriseRepository.deleteById(id);
	}
	
	@GetMapping("/getAll")
	public List<Entreprise> getAll() {
		return entrepriseRepository.findAll();
	}
	
	@GetMapping("/getById/{id}")
	public Entreprise getByid(@PathVariable("id") int id) {
		return entrepriseRepository.findById(id).orElse(null);
	}
	
}
