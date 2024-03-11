package com.danielnunesro.pets.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class HistoricoPeso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "info_id")
	private InfoPets infoId;
	
	private Double peso;
	
	private LocalDate data;

	public HistoricoPeso() {
		
	}
	
	public HistoricoPeso(InfoPets infoId, Double peso, LocalDate data) {
		super();
		this.infoId = infoId;
		this.peso = peso;
		this.data = data;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public InfoPets getInfoId() {
		return infoId;
	}

	public void setInfoId(InfoPets infoId) {
		this.infoId = infoId;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	
	
	

}
