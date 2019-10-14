package com.trifulcas.springprueba;

public class Vecino implements ISaludo {
	
	@Override
	public String hola() {
		return "Hola holita.";
	}
	@Override
	public String adios() {
		return "Hasta luego vecinillo.";
	}

}
