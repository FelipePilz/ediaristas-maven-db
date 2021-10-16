package br.com.treinaweb.ediaristasmavendb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.ediaristasmavendb.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long>{
	
	List<Diarista> findByCodigoIbge(String codigoIbge);

}
