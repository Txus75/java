package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList2 {
	
	// Metodo para devolver la palabra más larga
	static String palabraMasLarga(ArrayList<String> palabras) {
		// Variable
		String masLarga = "";
		
		// Busqueda de la palabra más larga
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
		
		// Petición de frase
		System.out.println("Introduzca una frase");
		
		frase = scan.nextLine();
		
		// Creación de ArrayList
		ArrayList<String> palabras = new ArrayList<String>(Arrays.asList(frase.split(" ")));

		// Llamada al método palabraMasLarga
		palabra = palabraMasLarga(palabras);
		
		// Impresión de resultados
		System.out.println("En la frase hay " + palabras.size() + " palabras");
		System.out.println("La primera palabra más larga es: " + palabra + ".");
		
		scan.close();
	}

}
