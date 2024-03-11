package com.danielnunesro.pets.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielnunesro.pets.dtos.RequestDto;
import com.danielnunesro.pets.dtos.ResponseDto;
import com.danielnunesro.pets.entities.HistoricoPeso;
import com.danielnunesro.pets.entities.InfoPets;
import com.danielnunesro.pets.exceptions.ResourceNotFoundException;
import com.danielnunesro.pets.mapper.RequestMapper;
import com.danielnunesro.pets.repositories.HistoricoPesoRepository;
import com.danielnunesro.pets.repositories.InfoPetsRepository;

import jakarta.transaction.Transactional;

@Service
public class HistoricoPesoService {
	
	@Autowired
	private HistoricoPesoRepository historicoRepository;
	
	@Autowired
	private InfoPetsRepository infoRepository;
	
	
	
	public ResponseDto create(RequestDto request) {
		var newPet = RequestMapper.INSTANCE.convertDtoToHistoricoPeso(request);
		newPet.setData(LocalDate.now());
		ResponseDto response = RequestMapper.INSTANCE.convertHistoricoPesoToResponseDto(historicoRepository.save(newPet));
		return response;
	}
	
	public ResponseDto addPeso(Long InfoPetsId, Double novoPeso) {
		var existingPets = infoRepository.findById(InfoPetsId).orElseThrow(() -> new ResourceNotFoundException("Não há animal cadastrado com esse id."));
		
		var novoHistorico = new HistoricoPeso(existingPets, novoPeso, LocalDate.now());
		historicoRepository.save(novoHistorico);
		ResponseDto response = RequestMapper.INSTANCE.convertHistoricoPesoToDto(novoHistorico);
		return response;
		
	}
	
	public List<HistoricoPeso> historicoPeso(InfoPets infoPets) {
		return historicoRepository.findAllByInfoId(infoPets);
	}
	
	public String deletePeso(Long id) {
		var existingPeso = historicoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Não há animal cadastrado com esse id.") );
		historicoRepository.deleteById(id);
		return "O peso: " + existingPeso.getPeso()+ ". Registrado no dia: " + existingPeso.getData() + " foi deletado!";
		
	}
	
	@Transactional
	public String deletePet (InfoPets infoPets) {
		var existingPets = infoRepository.findById(infoPets.getId()).orElseThrow(() -> new ResourceNotFoundException("Não há animal cadastrado com esse id."));
		
		historicoRepository.deleteAllByInfoId(existingPets);
		infoRepository.delete(existingPets);
		
		return "O petzinho: " + existingPets.getNomeAnimal() + ". Foi removido do nosso banco de dados com sucesso! \nSentiremos saudades";
	}
	
}
