package com.trifulcas.springprueba;

public class Saludos implements ISaludo {
	
	@Override
	public String hola() {
		return "Hola ¿Qué tal?";
	}
	@Override
	public String adios() {
		return "Adios, que te vaya bien.";
	}

}
