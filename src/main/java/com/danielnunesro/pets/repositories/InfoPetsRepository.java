package com.danielnunesro.pets.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielnunesro.pets.entities.HistoricoPeso;
import com.danielnunesro.pets.entities.InfoPets;

public interface InfoPetsRepository extends JpaRepository<InfoPets, Long> {
	
	
	
	
}
