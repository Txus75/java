package com.trifulcas.springprueba;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	@RequestMapping("verform")
	public String verFormulario() {
		return "formulario";
	}
	
	@RequestMapping("procesarform")
	public String procesarFormulario() {
		return "saludo";
	}

}
