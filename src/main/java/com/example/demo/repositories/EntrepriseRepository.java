package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}
