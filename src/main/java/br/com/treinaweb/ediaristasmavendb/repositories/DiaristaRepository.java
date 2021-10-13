package br.com.treinaweb.ediaristasmavendb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.ediaristasmavendb.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long>{
	
}
