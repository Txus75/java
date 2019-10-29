package com.trifulcas.springprueba;

import org.springframework.stereotype.Component;

@Component
public class Formal implements ISaludo {

	@Override
	public String hola() {
		return "Tengan todos ustedes muy buenos días.";
	}

	@Override
	public String adios() {
		return "Con la venia me despido.";
	}

}
