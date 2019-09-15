package analisisTexto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class analisisTexto {
	
	// Método para devolver un ArrayList ordenado con las frases más cortas primero
	static void fraseMasCorta(ArrayList<String> frases) {
		// ArrayList
		ArrayList<String> frasesOrdenadas = new ArrayList<String>();
		
		// Variable de control de la frase más larga
		int tamano = 0;
		
		// Frase más larga
		for (String e : frases) {
			if (e.length() > tamano) {
				tamano = e.length();
			}
		}
		
		// Bucle de control de tamaños
		for (int x = 0; x <= tamano; x++) {
			for (int i = 0; i < frases.size(); i++) {
				
				if (frases.get(i).length() == x) {
					frasesOrdenadas.add(frases.get(i));
				}
				
			}
		}
		
		// Impresión de ArrayList ordenado
		System.out.println("Frases ordenadas de la más corta a la más larga:");
		for (String e : frasesOrdenadas) {
			System.out.println(e);
		}
	}
	
	// Método para devolver un ArrayList ordenado con las palabras más repetidas
	static void palabrasRepetidas(ArrayList<String> palabras) {
		
		// Objeto palabra-veces
		class palabraVeces {
			private String palabra;
			private String veces;
			public palabraVeces(String palabra2, int repeticiones) {
				palabra = palabra2;
				veces = String.valueOf(repeticiones);
			}
			public String getPalabra() {
				return palabra;
			}
			public String getVeces() {
				return veces;
			}
		}
		
		// ArrayList
		ArrayList<palabraVeces> palabrasRepes = new ArrayList<palabraVeces>();
		
		// Ordenación preliminar de las palabras del ArrayList
		Collections.sort(palabras, String.CASE_INSENSITIVE_ORDER);
		
		
		// Comprobación de número de repeticiones
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
			
			// add objeto al ArrayList
			palabrasRepes.add(new palabraVeces(palabra, repeticiones));
			
		}
		
		// Ordenación		
		
		Collections.sort(palabrasRepes, new Comparator<palabraVeces>() {
			public int compare(palabraVeces obj1, palabraVeces obj2) {
				return obj2.getVeces().compareTo(obj1.getVeces());
			}
		});
		
		// Impresión de las palabras ordenadas
		System.out.println("Las palabras más repetidas son:");
		
		for(palabraVeces temp: palabrasRepes){
		    System.out.println("La palabra: " + temp.getPalabra() + " se repite " + temp.getVeces() + " veces.");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Variables
		String texto;
		
		// Petición de texto
		System.out.println("Introduzca un texto.");
		
		texto = scan.nextLine();
		
		// Creación de los ArrayList
		ArrayList<String> frases = new ArrayList<String>(Arrays.asList(texto.split("\\.")));
		ArrayList<String> palabras = new ArrayList<String>(Arrays.asList(texto.replace(".", "").split(" ")));
		
		//Anulación de los espacios sobrantes y añadido del punto final.
		for (int i = 0; i < frases.size(); i++) {
			frases.set(i, frases.get(i).trim() + ".");
		}
		
		fraseMasCorta(frases);
		
		palabrasRepetidas(palabras);
		
		scan.close();
	}

}
