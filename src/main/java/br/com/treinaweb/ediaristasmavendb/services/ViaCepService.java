package br.com.treinaweb.ediaristasmavendb.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import br.com.treinaweb.ediaristasmavendb.dtos.ViaCepResponse;
import br.com.treinaweb.ediaristasmavendb.exceptions.CepInvalidoException;
import br.com.treinaweb.ediaristasmavendb.exceptions.CepNaoEncontradoException;

@Service
public class ViaCepService {
	
	public ViaCepResponse buscarEnderecoPorCep(String cep){
		var url = "https://viacep.com.br/ws/"+ cep +"/json/";

		var clienteHttp = new RestTemplate();
		ResponseEntity<ViaCepResponse> response;
		
		try{
			response = clienteHttp.getForEntity(url, ViaCepResponse.class);
		}catch(HttpClientErrorException.BadRequest e){
			throw new CepInvalidoException("CEP Inválido!");
		}


		if(response.getBody().getCep() == null){
			throw new CepNaoEncontradoException("CEP não encontrado!");
		}
		return response.getBody();
	}

}
