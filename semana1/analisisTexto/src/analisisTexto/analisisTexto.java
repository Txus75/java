package analisisTexto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class analisisTexto {
	
	// M�todo para devolver un ArrayList ordenado con las frases m�s cortas primero
	static void fraseMasCorta(ArrayList<String> frases) {
		// ArrayList
		ArrayList<String> frasesOrdenadas = new ArrayList<String>();
		
		// Variable de control de la frase m�s larga
		int tamano = 0;
		
		// Frase m�s larga
		for (String e : frases) {
			if (e.length() > tamano) {
				tamano = e.length();
			}
		}
		
		// Bucle de control de tama�os
		for (int x = 0; x <= tamano; x++) {
			for (int i = 0; i < frases.size(); i++) {
				
				if (frases.get(i).length() == x) {
					frasesOrdenadas.add(frases.get(i));
				}
				
			}
		}
		
		// Impresi�n de ArrayList ordenado
		System.out.println("Frases ordenadas de la m�s corta a la m�s larga:");
		for (String e : frasesOrdenadas) {
			System.out.println(e);
		}
	}
	
	static void palabrasRepetidas(ArrayList<String> palabras) {
		// ArrayList
		ArrayList<String> palabrasRepes = new ArrayList<String>();
		
		// ArrayList bidimensional
		//ArrayList<ArrayList<String>> palabrasRepes = new ArrayList<ArrayList<String>>();
		
		// Comprobaci�n de n�mero de repeticiones
		while (palabras.size() > 0) {
			int repeticiones = 0;
			String palabra = palabras.get(0);
			
			for (int i = 0; i < palabras.size(); i++) {
				
				if (palabra.equalsIgnoreCase(palabras.get(i))) {
					repeticiones++;
					palabras.remove(i);
                    i--;
				}
				
			}
			
			// add unidimensional
			palabrasRepes.add(repeticiones + " " + palabra);
			
			// add bidimensinal
			//ArrayList<String> temp = new ArrayList<String>(); 
			//temp.add(palabra);
			//temp.add(String.valueOf(repeticiones));
			//palabrasRepes.add(temp);
		}
		
		// Ordenaci�n
		//Collections.sort(palabrasRepes);
		Collections.sort(palabrasRepes, String.CASE_INSENSITIVE_ORDER);
		
		// Impresi�n de las palabras ordenadas
		System.out.println("Las palabras m�s repetidas son:");
		
		for (int z = palabrasRepes.size() - 1; z >= 0; z--) {
			System.out.println(palabrasRepes.get(z));
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Variables
		String texto;
		
		// Petici�n de texto
		System.out.println("Introduzca un texto.");
		
		texto = scan.nextLine();
		
		// Creaci�n de los ArrayList
		ArrayList<String> frases = new ArrayList<String>(Arrays.asList(texto.split("\\.")));
		ArrayList<String> palabras = new ArrayList<String>(Arrays.asList(texto.replace(".", "").split(" ")));
		
		//Anulaci�n de los espacios sobrantes y a�adido del punto final.
		for (int i = 0; i < frases.size(); i++) {
			frases.set(i, frases.get(i).trim() + ".");
		}
		
		fraseMasCorta(frases);
		
		palabrasRepetidas(palabras);
		
		scan.close();
	}

}
