package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String nom;
	private String prenom;
	private String fonction;
	private String profil;
	@ManyToOne
	private Entreprise entreprise;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(int id, String nom, String prenom, String fonction, String profil, Entreprise entreprise) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.profil = profil;
		this.entreprise = entreprise;
	}

	public Contact(String nom, String prenom, String fonction, String profil, Entreprise entreprise) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.fonction = fonction;
		this.profil = profil;
		this.entreprise = entreprise;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", fonction=" + fonction + ", profil="
				+ profil + ", entreprise=" + entreprise + "]";
	}
	
}
