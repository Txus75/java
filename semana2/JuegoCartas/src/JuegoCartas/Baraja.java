package JuegoCartas;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Baraja {
	// Propiedades
	protected ArrayList<Carta> cartas;
	
	// Métodos
	public void barajar() {
		Collections.shuffle(cartas);
	}
	
	public Carta repartir() {
		return cartas.remove(0);
	}
	
	abstract public void reiniciar();
}
