package JuegoCartas;

public class Espanyola extends Baraja {
	// Constructor
	public Espanyola() {
		reiniciar();
	}
	
	// Metodo
	public void reiniciar() {
		// Borrado del ArrayList
		cartas.clear();
		
		// Creación de baraja
		for(int i = 0; i <4; i++) {
			// Array de palos
			String[] palos = {"espadas", "bastos", "oros", "copas"};
			
			// Creación de nombre y valor
			for(int j = 1; j < 11; j++) {
				String num = "";
				int valor = 0;
				if(j < 8) {
					num = Integer.toString(j);
					valor = j;
				} else if(j == 8) {
					num = "Sota";
					valor = 10;
				} else if(j == 9) {
					num = "Caballo";
					valor = 10;
				} else if(j == 10) {
					num = "Rey";
					valor = 10;
				}
				Carta temp = new Carta(palos[i], num, valor);
				cartas.add(temp);
			}
		}
	}
}
