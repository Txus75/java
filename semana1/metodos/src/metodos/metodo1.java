package metodos;

import java.util.Scanner;

public class metodo1 {

	// Método para averiguar que cadena es más larga
	static String cadenaMasLarga (String a, String b) {
		// Variable
		String salida = "";
		
		// Comprobación de longitud
		if (a.length() > b.length()) {
			salida = "La palabra más larga es " + a + ".";
		} else if (a.length() != b.length()) {
			salida = "La palabra más larga es " + b + ".";
		} else {
			salida = "Las dos palabras tienen la misma longitud.";
		}
		
		// Devolución
		return salida;
	};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Variables
		String string1;
		String string2;
		String resultado;
		
		// Petición de cadenas
		System.out.println ("Introduzca una palabra:");
		
		string1 = scan.nextLine();
		
		System.out.println ("Introduzca otra palabra:");
		
		string2 = scan.nextLine();
		
		// Llamada al método
		resultado = cadenaMasLarga(string1, string2);
		
		// Impresión en pantalla
		System.out.println(resultado);
		
		scan.close();
	}

}
