package br.com.treinaweb.ediaristasmavendb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Entity
@Data //Generate getters, setters, and toString method.
@NoArgsConstructor//Generate a empty constructor
@AllArgsConstructor//Generate a constructor with all atributes
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Diarista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;

	@Column(nullable = false, length = 100)
	private String nomeCompleto;

	@Column(nullable = false, unique = true, length = 11)
	private String cpf;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false, length = 11)
	private String telefone;

	@Column(nullable = false)
	private String logradouro;

	@Column(nullable = false)
	private String numero;

	@Column(nullable = false)
	private String bairro;

	@Column(nullable = true)
	private String complemento;

	@Column(nullable = false, length = 8)
	private String cep;

	@Column(nullable = false, length = 2)
	private String estado;

	@Column(nullable = false)
	private String cidade;

	@Column(nullable = false)
	private String codigoIbge;

}
