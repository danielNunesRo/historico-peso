package com.danielnunesro.pets.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InfoPets implements Serializable {
	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String dono;
	
	@Column(name = "email_dono")
	private String emailDono;
	
	@Column(name = "telefone_dono")
	private String telefoneDono;
	
	@Column(name = "nome_pet")
	private String nomeAnimal;
	
	private String especie;
	
	private String raca;	
	
	public InfoPets() {
		
	}

	public InfoPets(String dono, String emailDono, String telefoneDono, String nomeAnimal, String especie,
			String raca) {
		super();
		this.dono = dono;
		this.emailDono = emailDono;
		this.telefoneDono = telefoneDono;
		this.nomeAnimal = nomeAnimal;
		this.especie = especie;
		this.raca = raca;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public String getEmailDono() {
		return emailDono;
	}

	public void setEmailDono(String emailDono) {
		this.emailDono = emailDono;
	}

	public String getTelefoneDono() {
		return telefoneDono;
	}

	public void setTelefoneDono(String telefoneDono) {
		this.telefoneDono = telefoneDono;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	
}
