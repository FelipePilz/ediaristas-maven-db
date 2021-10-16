package br.com.treinaweb.ediaristasmavendb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.treinaweb.ediaristasmavendb.models.Diarista;
import br.com.treinaweb.ediaristasmavendb.repositories.DiaristaRepository;

@RestController
@RequestMapping("/api/diaristas-cidade")
public class DiaristaRestController {
	
	@Autowired
	private DiaristaRepository repository;

	@GetMapping
	public List<Diarista> buscarDiaristasPorCep(){
		return repository.findAll();
	}
}
