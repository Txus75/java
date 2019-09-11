package metodos;

import java.util.Scanner;

public class metodo1 {

	// M�todo para averiguar que cadena es m�s larga
	static String cadenaMasLarga (String a, String b) {
		// Variable
		String salida = "";
		
		// Comprobaci�n de longitud
		if (a.length() > b.length()) {
			salida = "La palabra m�s larga es " + a + ".";
		} else if (a.length() != b.length()) {
			salida = "La palabra m�s larga es " + b + ".";
		} else {
			salida = "Las dos palabras tienen la misma longitud.";
		}
		
		// Devoluci�n
		return salida;
	};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Variables
		String string1;
		String string2;
		String resultado;
		
		// Petici�n de cadenas
		System.out.println ("Introduzca una palabra:");
		
		string1 = scan.nextLine();
		
		System.out.println ("Introduzca otra palabra:");
		
		string2 = scan.nextLine();
		
		// Llamada al m�todo
		resultado = cadenaMasLarga(string1, string2);
		
		// Impresi�n en pantalla
		System.out.println(resultado);
		
		scan.close();
	}

}
