package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Role;
import com.example.demo.repositories.RoleRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@GetMapping("/getAll")
	public List<Role> getAll() {
		return roleRepository.findAll();
	}

}
