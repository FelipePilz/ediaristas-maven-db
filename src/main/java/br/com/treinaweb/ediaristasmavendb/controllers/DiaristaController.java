package br.com.treinaweb.ediaristasmavendb.controllers;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.ediaristasmavendb.models.Diarista;
import br.com.treinaweb.ediaristasmavendb.repositories.DiaristaRepository;
import br.com.treinaweb.ediaristasmavendb.services.FileService;

@Controller
@RequestMapping("/admin/diaristas")
public class DiaristaController {
	//Show page

	@Autowired
	private DiaristaRepository repository;
	
	@Autowired
	private FileService fileService;

	// -- LIST DIARISTAS
	@GetMapping// (admin/diaristas) <- route
	public ModelAndView listar(){
		var modelAndView = new ModelAndView("admin/diaristas/listar");
		modelAndView.addObject("diaristas", repository.findAll());
		return modelAndView;
	}
	// --


	// -- ADD NEW DIARISTAS
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar(){
		var modelAndView = new ModelAndView("admin/diaristas/form");//Located in
		
		modelAndView.addObject("diarista", new Diarista());
		
		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public String cadastrar(@RequestParam MultipartFile imagem, @Valid Diarista diarista, BindingResult result) throws IOException{
		if(result.hasErrors()){
			return "admin/diaristas/form";
		}

		var filename = fileService.salvar(imagem);
		diarista.setFoto(filename);
		repository.save(diarista);
		return "redirect:/admin/diaristas";//Sending to the listar page!
	}
	// --

	// -- EDIT DIARISTA
	@GetMapping("/{id}/editar")
	public ModelAndView editar(@PathVariable Long id){
		var modelAndView = new ModelAndView("admin/diaristas/form");//Same template as form
		modelAndView.addObject("diarista", repository.getById(id));
		return modelAndView;
	}

	@PostMapping("/{id}/editar")
	public String editar(@RequestParam MultipartFile imagem, @PathVariable Long id,@Valid Diarista diarista, BindingResult result) throws IOException{
		if(result.hasErrors()){
			return "admin/diaristas/form";
		}

		var diaristaAtual = repository.getById(id);
		if(imagem.isEmpty()){
			diarista.setFoto(diaristaAtual.getFoto());
		}else{
			var filename = fileService.salvar(imagem);
			diarista.setFoto(filename);
		}
		repository.save(diarista);
		return "redirect:/admin/diaristas";
	}
	// --

	// -- DELETE DIARISTA
	@GetMapping("/{id}/excluir")
	public String excluir(@PathVariable Long id){
		repository.deleteById(id);
		return "redirect:/admin/diaristas";
	}
	// --
}
