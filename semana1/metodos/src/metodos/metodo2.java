package metodos;

import java.util.Scanner;

public class metodo2 {

	// Metodo para averiguar el n�mero de veces que se repite un caracter en una cadena
	static int numRepeticiones (String cadena, String caracter) {
		// Variables
		int posicion = 0;
		int numVeces = 0;
		
		// Comprobaci�n
		while (posicion < cadena.length()) {
			posicion = cadena.indexOf(caracter, posicion);
			if (posicion > -1) {
				numVeces++;
				posicion++;
			} else {
				break;
			}
		}	
		
		// Devoluci�n
		return numVeces;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Variables
		String caden;
		String carac;
		int resultado;
		
		// Petici�n de palabra
		System.out.println ("Introduzca una palabra:");
		
		caden = scan.nextLine();
		
		// Petici�n de letra
		System.out.println ("Introduzca una letra:");
		
		carac = scan.nextLine();
		
		// Llamada al m�todo
		resultado = numRepeticiones(caden, carac);
		
		// Impresi�n en pantalla
		System.out.println("El caracter " + carac + " se repite " + resultado + " veces en la palabra " + caden);
		
		scan.close();
	}

}
