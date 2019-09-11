package metodos;

import java.util.Scanner;

public class metodo2 {

	// Metodo para averiguar el número de veces que se repite un caracter en una cadena
	static int numRepeticiones (String cadena, String caracter) {
		// Variables
		int posicion = 0;
		int numVeces = 0;
		
		// Comprobación
		while (posicion < cadena.length()) {
			posicion = cadena.indexOf(caracter, posicion);
			if (posicion > -1) {
				numVeces++;
				posicion++;
			} else {
				break;
			}
		}	
		
		// Devolución
		return numVeces;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Variables
		String caden;
		String carac;
		int resultado;
		
		// Petición de palabra
		System.out.println ("Introduzca una palabra:");
		
		caden = scan.nextLine();
		
		// Petición de letra
		System.out.println ("Introduzca una letra:");
		
		carac = scan.nextLine();
		
		// Llamada al método
		resultado = numRepeticiones(caden, carac);
		
		// Impresión en pantalla
		System.out.println("El caracter " + carac + " se repite " + resultado + " veces en la palabra " + caden);
		
		scan.close();
	}

}
