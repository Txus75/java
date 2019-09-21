package JuegoCartas;

import java.util.ArrayList;

public class Jugador {
	// Propiedades
	private String nombre;
	private ArrayList<Carta> cartas;
	
	// Constructor
	public Jugador(String nombre) {
		super();
		this.nombre = nombre;
		cartas = new ArrayList<Carta>();
	}

	// Seters y Geters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Metodos
	public void  darCarta(Carta carta) {
		cartas.add(carta);
	}

	public Carta  retirarCarta(int indice) {
		return cartas.remove(indice);
	}
	
	public String juego() {
		String cadena = "[";
		for (Carta naipe : cartas) {
			cadena += naipe.toString() + ",";
		}
		cadena = cadena.substring(0, cadena.length()-1);
		cadena += "]";
		return cadena;
	}
}
