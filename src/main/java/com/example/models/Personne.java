package com.example.models;

public class Personne {

	private Integer id;
	private String nom;

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + "]";
	}

}
