package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Contact;


public interface ContactRepository extends JpaRepository<Contact, Integer> {
	public List<Contact> findByEntrepriseId(int id);
}
