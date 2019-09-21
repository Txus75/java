package JuegoCartas;

import java.util.ArrayList;

public class Poker {
	// Propiedades
	private Francesa baraja = new Francesa();
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	// Constructor
	public Poker(ArrayList<String> jugadores) {
		for (String i : jugadores) {
			Jugador x = new Jugador(i);
			addJugador(x);
		}
		baraja.barajar();
	}

	// Métodos
	void addJugador(Jugador j) {
		jugadores.add(j);
	}
	
	void repartir() {
		for(Jugador j : jugadores) {
			for (int k = 0; k < 5; k++) {
				Carta carta = baraja.repartir();
				j.darCarta(carta);
			}
		}
	}
	
	void verJuego() {
		for(Jugador j : jugadores) {
			System.out.println("El jugador " + j.getNombre() + " tiene la siguiente mano:");
			System.out.println(j.juego());
		}
	}
}
