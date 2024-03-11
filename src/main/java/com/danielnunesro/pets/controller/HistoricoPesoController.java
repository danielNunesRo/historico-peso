package com.danielnunesro.pets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.danielnunesro.pets.dtos.RequestDto;
import com.danielnunesro.pets.dtos.ResponseDto;
import com.danielnunesro.pets.entities.HistoricoPeso;
import com.danielnunesro.pets.entities.InfoPets;
import com.danielnunesro.pets.service.HistoricoPesoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/pets")
@Tag(name= "Historico de Peso", description= "Endpoints for Managing Historico de Peso")
public class HistoricoPesoController {
	
	@Autowired
	private HistoricoPesoService service;
	
	
	@Operation(summary = "Adds a new Pet", description = "Adds a new Pet passing in JSON", tags = {"Pets"}, responses = {
			@ApiResponse(description = "Sucess", responseCode = "200", content = @Content(schema = @Schema(implementation = ResponseDto.class)))
			})
	@PostMapping
	public ResponseEntity<ResponseDto> criar(@RequestBody RequestDto request) {
		ResponseDto response = service.create(request);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@Operation(summary = "Adds a new weight", description = "A\r\n"
			+ "Adiciona um novo peso passando in Params Long id e Double peso", tags = {"Pets"}, responses = {
			@ApiResponse(description = "Sucess", responseCode = "200", content = @Content(schema = @Schema(implementation = ResponseDto.class)))
			})
	@PostMapping("/adicionarpeso")
	public ResponseEntity<ResponseDto> addPeso(@RequestParam Long infoPetsId, @RequestParam Double novoPeso) {
		var pesoAdd = service.addPeso(infoPetsId, novoPeso);
		return ResponseEntity.ok().body(pesoAdd);
		
	}
	
	@GetMapping("/{infoPetsId}/historicoPeso")
	@Operation(summary = "Find a pet's weight history", description = "Finds aa pet's weight history passing Id", tags = {"Pets"}, responses = {
			@ApiResponse(description = "Sucess", responseCode = "200", content = @Content(schema = @Schema(implementation = ResponseDto.class)))
			})
    public List<HistoricoPeso> findAllHistoricoPesoByInfoPets(@PathVariable Long infoPetsId) {
		InfoPets infoPets = new InfoPets();
        infoPets.setId(infoPetsId);
        return service.historicoPeso(infoPets);
    }
	
	
	@Operation(summary = "Deletes a weight specific", description = "Deletes a weight by passing in Long id on PathVariable", tags = {"Pets"}, responses = {
			@ApiResponse(description = "O peso: \" + existingPeso.getPeso()+ \". Registrado no dia: \" + existingPeso.getData() + \" foi deletado!", responseCode = "200", content = @Content),
	})
	@DeleteMapping("/deletePeso/{id}")
	public ResponseEntity<String> deletePeso(@PathVariable Long id) {
		String responseMessage = service.deletePeso(id);
		return ResponseEntity.ok(responseMessage);
	}
	
	@Operation(summary = "Deletes a pet in database", description = "Delete a registry in database", tags = {"Pets"}, responses = {
			@ApiResponse(description = "O petzinho: \" + existingPets.getNomeAnimal() + \". Foi removido do nosso banco de dados com sucesso! \\nSentiremos saudades", responseCode = "200", content = @Content),
	})
	@DeleteMapping("/excluirRegistro/{pets}")
	public ResponseEntity<String> deletePet(@PathVariable InfoPets pets) {
		String deleted = service.deletePet(pets);
		return ResponseEntity.ok(deleted);
	}
	
	
}
