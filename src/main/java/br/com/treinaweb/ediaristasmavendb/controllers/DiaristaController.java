package br.com.treinaweb.ediaristasmavendb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.ediaristasmavendb.models.Diarista;
import br.com.treinaweb.ediaristasmavendb.repositories.DiaristaRepository;

@Controller
@RequestMapping("/admin/diaristas")
public class DiaristaController {
	//Show page

	@Autowired
	private DiaristaRepository repository;

	@GetMapping// (admin/diaristas) <- route
	public ModelAndView listar(){
		var modelAndView = new ModelAndView("admin/diaristas/listar");
		modelAndView.addObject("diaristas", repository.findAll());
		return modelAndView;
	}


	// -- ADD NEW DIARISTAS
	@GetMapping("/cadastrar")
	public ModelAndView cadastrar(){
		var modelAndView = new ModelAndView("admin/diaristas/form");//Located in
		
		modelAndView.addObject("diarista", new Diarista());
		
		return modelAndView;
	}

	@PostMapping("/cadastrar")
	public String cadastrar(Diarista diarista){
		repository.save(diarista);
		return "redirect:/admin/diaristas/cadastrar";
	}
	// --
}
