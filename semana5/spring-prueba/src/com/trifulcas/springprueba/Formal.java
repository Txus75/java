package com.trifulcas.springprueba;

public class Formal implements ISaludo {
	
	@Override
	public String hola() {
		return "Buenos d�as.";
	}
	@Override
	public String adios() {
		return "Hasta la pr�xima.";
	}

}
