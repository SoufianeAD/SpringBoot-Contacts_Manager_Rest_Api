package com.example.demo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String role;
	@ManyToMany(mappedBy = "roles")
	private List<Utilisateur> utilisateurs;
	
	public Role() {
		// TODO Auto-generated constructor stub
	}

	public Role(int id, String role, List<Utilisateur> utilisateurs) {
		super();
		this.id = id;
		this.role = role;
		this.utilisateurs = utilisateurs;
	}

	public Role(String role, List<Utilisateur> utilisateurs) {
		super();
		this.role = role;
		this.utilisateurs = utilisateurs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", utilisateurs=" + utilisateurs + "]";
	}
	
}
