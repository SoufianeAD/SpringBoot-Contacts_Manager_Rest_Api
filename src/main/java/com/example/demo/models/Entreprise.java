package com.example.demo.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Entreprise {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String nom;
	private int nombreEmploye;
	private String secteurActivite;
	private String ville;
	private String pays;
	@OneToMany(mappedBy = "entreprise", cascade = CascadeType.REMOVE)
	private List<Contact> contacts;
	
	public Entreprise() {
		// TODO Auto-generated constructor stub
	}

	public Entreprise(int id, String nom, int nombreEmploye, String secteurActivite, String ville, String pays,
			List<Contact> contacts) {
		super();
		this.id = id;
		this.nom = nom;
		this.nombreEmploye = nombreEmploye;
		this.secteurActivite = secteurActivite;
		this.ville = ville;
		this.pays = pays;
		this.contacts = contacts;
	}

	public Entreprise(String nom, int nombreEmploye, String secteurActivite, String ville, String pays,
			List<Contact> contacts) {
		super();
		this.nom = nom;
		this.nombreEmploye = nombreEmploye;
		this.secteurActivite = secteurActivite;
		this.ville = ville;
		this.pays = pays;
		this.contacts = contacts;
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

	public int getNombreEmploye() {
		return nombreEmploye;
	}

	public void setNombreEmploye(int nombreEmploye) {
		this.nombreEmploye = nombreEmploye;
	}

	public String getSecteurActivite() {
		return secteurActivite;
	}

	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", nom=" + nom + ", nombreEmploye=" + nombreEmploye + ", secteurActivite="
				+ secteurActivite + ", ville=" + ville + ", pays=" + pays + ", contacts=" + contacts + "]";
	}
	
}
