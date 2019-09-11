package bucles;

import java.util.Scanner;

public class bucle02 {

	public static void main(String[] args) {
		Scanner cadena = new Scanner(System.in);
		
		// Variables
		String cad;
		int posicion = 0;
		int numVeces = 0;
		
		System.out.println ("Introduzca una palabra");
		
		cad = cadena.nextLine();
		
		while (posicion < cad.length()) {
			posicion = cad.indexOf('a', posicion);
			if (posicion > -1) {
				numVeces++;
				posicion++;
			} else {
				break;
			}
		}
		
		System.out.println("La letra \"a\" minúscula aparece " + numVeces + " veces.");

		cadena.close();
	}

}
