package com.danielnunesro.pets.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielnunesro.pets.entities.HistoricoPeso;
import com.danielnunesro.pets.entities.InfoPets;

public interface HistoricoPesoRepository extends JpaRepository<HistoricoPeso, Long> {
	
	List<HistoricoPeso> findAllByInfoId(InfoPets infoPets);
	
	void deleteAllByInfoId(InfoPets infoPets);
	
}
