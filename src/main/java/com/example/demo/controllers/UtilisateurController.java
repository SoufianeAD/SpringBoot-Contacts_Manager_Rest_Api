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

import com.example.demo.models.Utilisateur;
import com.example.demo.repositories.UtilisateurRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;
	
	@PostMapping("/add")
	public Utilisateur add(@RequestBody Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}
	
	@PutMapping("/update")
	public Utilisateur update(@RequestBody Utilisateur utilisateur) {
		return utilisateurRepository.save(utilisateur);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		utilisateurRepository.deleteById(id);
	}
	
	@GetMapping("/getAll")
	public List<Utilisateur> getAll() {
		return utilisateurRepository.findAll();
	}
	
	@GetMapping("/getById/{id}")
	public Utilisateur getByid(@PathVariable("id") int id) {
		return utilisateurRepository.findById(id).orElse(null);
	}
	
	@GetMapping("/getByUserNameAndPassword")
	public Utilisateur getByEntrepriseId(@RequestBody Utilisateur utilisateur) {
		return utilisateurRepository.findByUserNameAndPassword(utilisateur.getUserName(), utilisateur.getPassword());
	}
	
}

