package JuegoCartas;

import java.util.ArrayList;

public class Francesa extends Baraja {
	// Constructor
	public Francesa() {
		reiniciar();
	}
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	// Metodo
	public void reiniciar() {
		// Borrado del ArrayList
		cartas.clear();
		
		// Creación de baraja
		for(int i = 0; i <4; i++) {
			// Array de palos
			String[] palos = {"picas", "tréboles", "diamantes", "corazones"};
			
			// Creación de nombre y valor
			for(int j = 1; j < 14; j++) {
				String num = "";
				int valor = 0;
				if(j < 11) {
					num = Integer.toString(j);
					valor = j;
				} else if(j == 11) {
					num = "J";
					valor = 10;
				} else if(j == 12) {
					num = "Q";
					valor = 10;
				} else if(j == 13) {
					num = "K";
					valor = 10;
				}
				Carta temp = new Carta(palos[i], num, valor);
				cartas.add(temp);
			}
		}
	}
}
