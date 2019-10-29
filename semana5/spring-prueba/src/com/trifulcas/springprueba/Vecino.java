package com.trifulcas.springprueba;

public class Vecino {
	
	private ISaludo _saludo;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/*public Vecino(ISaludo miSaludo) {
		_saludo = miSaludo;
	}*/
	
	public void setSaludo(ISaludo miSaludo) {
		_saludo = miSaludo;
	}
	
	public String hola() {
		return "Soy " + nombre + " " + _saludo.hola();
	}
	
	public String adios() {
		return _saludo.adios();
	}

}
