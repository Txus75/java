package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList2 {
	
	// Metodo para devolver la palabra m�s larga
	static String palabraMasLarga(ArrayList<String> palabras) {
		// Variable
		String masLarga = "";
		
		// Busqueda de la palabra m�s larga
		for (String i : palabras) {
			if (i.length() > masLarga.length()) {
				masLarga = i;
			}
		}		
		
		return masLarga;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Variable
		String frase;
		String palabra;
		
		// Petici�n de frase
		System.out.println("Introduzca una frase");
		
		frase = scan.nextLine();
		
		// Creaci�n de ArrayList
		ArrayList<String> palabras = new ArrayList<String>(Arrays.asList(frase.split(" ")));

		// Llamada al m�todo palabraMasLarga
		palabra = palabraMasLarga(palabras);
		
		// Impresi�n de resultados
		System.out.println("En la frase hay " + palabras.size() + " palabras");
		System.out.println("La primera palabra m�s larga es: " + palabra + ".");
		
		scan.close();
	}

}
