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

import com.example.demo.models.Contact;
import com.example.demo.repositories.ContactRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@PostMapping("/add")
	public Contact add(@RequestBody Contact contact) {
		return contactRepository.save(contact);
	}
	
	@PutMapping("/update")
	public Contact update(@RequestBody Contact contact) {
		return contactRepository.save(contact);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		contactRepository.deleteById(id);
	}
	
	@GetMapping("/getAll")
	public List<Contact> getAll() {
		return contactRepository.findAll();
	}
	
	@GetMapping("/getById/{id}")
	public Contact getByid(@PathVariable("id") int id) {
		return contactRepository.findById(id).orElse(null);
	}
	
	@GetMapping("/getByEntrepriseId/{id}")
	public List<Contact> getByEntrepriseId(@PathVariable("id") int id) {
		return contactRepository.findByEntrepriseId(id);
	}
	
}
