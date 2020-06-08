package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Role;
import com.example.demo.models.Utilisateur;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.repositories.UtilisateurRepository;

@SpringBootApplication
public class ContactsManagerApplication implements CommandLineRunner {

	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	UtilisateurRepository utilisateurRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ContactsManagerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		if(roleRepository.findAll().size() == 0) {
			Role role1 = new Role();
			role1.setRole("utilisateur");
			Role role2 = new Role();
			role2.setRole("admin");
			roleRepository.save(role1);
			roleRepository.save(role2);
		}
		
		if(utilisateurRepository.findAll().size() == 0) {
			Utilisateur utilisateur = new Utilisateur("admin", "admin1234", roleRepository.findAll());
			utilisateur = utilisateurRepository.save(utilisateur);
		}
	}

}
