package ejercicioIf;

import java.util.Scanner;

public class EjercicioIf {

	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);

		// Variables de clase integer
		int altura;
		int edad;
		
		// Petición de la altura
		System.out.println ("Introduzca la altura del niño en centímetros");
		
		altura = valores.nextInt();
		
		// Petición de la edad
		System.out.println ("Introduzca la edad del niño");
		
		edad = valores.nextInt();
		
		// Condicional
		if (altura > 140 || edad > 16) {
			System.out.println("El niño puede entrar en la atracción, que la disfrute.");
		} else {
			System.out.println("El niño no puede entrar en la atracción, lo sentimos.");
		}
		
		valores.close();
	}

}
