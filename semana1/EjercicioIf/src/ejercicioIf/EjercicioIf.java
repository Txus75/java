package ejercicioIf;

import java.util.Scanner;

public class EjercicioIf {

	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);

		// Variables de clase integer
		int altura;
		int edad;
		
		// Petici�n de la altura
		System.out.println ("Introduzca la altura del ni�o en cent�metros");
		
		altura = valores.nextInt();
		
		// Petici�n de la edad
		System.out.println ("Introduzca la edad del ni�o");
		
		edad = valores.nextInt();
		
		// Condicional
		if (altura > 140 || edad > 16) {
			System.out.println("El ni�o puede entrar en la atracci�n, que la disfrute.");
		} else {
			System.out.println("El ni�o no puede entrar en la atracci�n, lo sentimos.");
		}
		
		valores.close();
	}

}
