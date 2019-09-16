package codificacionNumeros;

import java.util.ArrayList;
import java.util.Scanner;

public class CodificacionNumeros {
	
	// M�todo de codificaci�n
	static void codificacion(String codi) {
		// Variable
		String palabraCodi = "";
		
		// Pasar cadena a min�sculas
		codi = codi.toLowerCase();
		
		// Codificaci�n
		for (int i = 0; i < codi.length(); i++) {
			char caracter = codi.charAt(i);
			switch(caracter) {
				case 'a':
				case 'b':
				case 'c':
					palabraCodi += "2";
					break;
				case 'd':
				case 'e':
				case 'f':
					palabraCodi += "3";
					break;
				case 'g':
				case 'h':
				case 'i':
					palabraCodi += "4";
					break;
				case 'j':
				case 'k':
				case 'l':
					palabraCodi += "5";
					break;
				case 'm':
				case 'n':
				case 'o':
					palabraCodi += "6";
					break;
				case 'p':
				case 'q':
				case 'r':
				case 's':
					palabraCodi += "7";
					break;
				case 't':
				case 'u':
				case 'v':
					palabraCodi += "8";
					break;
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					palabraCodi += "9";
					break;
			}
		}
		
		// Impresi�n en pantalla
		System.out.println("La palabra corresponde al n�mero: " + palabraCodi);
	}
	
	// M�todo de codificaci�n
	static void decodificacion(String decodi) {
		// Variable
		String numeroDecodi;
		
		// ArrayList
		ArrayList<String> letras = new ArrayList<String>();
		
		// Decodificaci�n
		for(int i = 0; i < decodi.length(); i++) {
			char numero = decodi.charAt(i);
			switch(numero) {
				case '2':
					letras.add("ABC");
					break;
				case '3':
					letras.add("DEF");
					break;
				case '4':
					letras.add("GHI");
					break;
				case '5':
					letras.add("JKL");
					break;
				case '6':
					letras.add("MNO");
					break;
				case '7':
					letras.add("PRS");
					break;
				case '8':
					letras.add("TUV");
					break;
				case '9':
					letras.add("WXY");
					break;
			}
		}
		
		// Impresi�n en pantalla
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					numeroDecodi = "";
					numeroDecodi += letras.get(0).charAt(i);
					numeroDecodi += letras.get(1).charAt(j);
					numeroDecodi += letras.get(2).charAt(k);
					System.out.println(numeroDecodi);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Variables
		String cod;
		String palabra;
		String numeros;
		boolean compro = true;
		
		do {
		// Palabras o n�meros
		System.out.println("�Quiere introducir una palabra o un n�mero? [pal/num]");
	
		cod = scan.nextLine();
		
		// Comprobaci�n de respuesta y env�o a m�todo
			if (cod.equals("pal")) {
				System.out.println("Introduzca la palabra:");
				palabra = scan.nextLine();
				codificacion(palabra);
				compro = false;
			} else if (cod.equals("num")) {
				System.out.println("Introduzca el n�mero:");
				numeros = scan.nextLine();
				decodificacion(numeros);
				compro = false;
			} else {
				System.out.println("El valor introducido no es v�lido.");
			}
		} while (compro);
		
		scan.close();
	}

}
