package com.danielnunesro.pets.dtos;

public class RequestDto {
	
	private String dono;
	
	private String emailDono;
	
	private String telefoneDono;
	
	private String nomeAnimal;
	
	private String especie;
	
	private String raca;
	
	private double peso;
	
	public RequestDto() {
		
	}
	

	public RequestDto(String dono, String emailDono, String telefoneDono, String nomeAnimal, String especie,
			String raca, double peso) {
		super();
		this.dono = dono;
		this.emailDono = emailDono;
		this.telefoneDono = telefoneDono;
		this.nomeAnimal = nomeAnimal;
		this.especie = especie;
		this.raca = raca;
		this.peso = peso;
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
