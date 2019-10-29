package com.trifulcas.springprueba;

public class Formal implements ISaludo {
	
	@Override
	public String hola() {
		return "Buenos días.";
	}
	@Override
	public String adios() {
		return "Hasta la próxima.";
	}

}
