package com.trifulcas.springprueba;

public class Informal implements ISaludo {
	
	@Override
	public String hola() {
		return "¿Qué pasa en la casa coleguis?";
	}
	
	@Override
	public String adios() {
		return "Me las piro, vampiro.";
	}

}
