package br.com.treinaweb.ediaristasmavendb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.ediaristasmavendb.models.Diarista;

@Controller
@RequestMapping("/admin/diaristas")
public class DiaristaController {
	//Show page

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar(){
		var modelAndView = new ModelAndView("admin/diaristas/form");//Located in
		
		modelAndView.addObject("diarista", new Diarista());
		
		return modelAndView;
	}
}
