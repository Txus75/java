package com.trifulcas.springprueba;

import org.springframework.stereotype.Component;

@Component
public class Vecino implements ISaludo {
	
	@Override
	public String hola() {
	return "Holi vecinito.";
	}
	
	@Override
	public String adios() {
	return "¡¡Hasta luegi!!";
	}

}
