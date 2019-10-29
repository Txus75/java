package com.trifulcas.springprueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("miSaludo")
public class Saludos {
	
	@Autowired
	@Qualifier("formal")
	private ISaludo _saludo;
	
	public Saludos(ISaludo saludo) {
		_saludo = saludo;
	}
	
	public String hola() {
		//return "Hola que tal.";
		return _saludo.hola();
	}
	
	public String adios() {
		//return "Adios que te vaya bien.";
		return _saludo.adios();
	}
	
}
