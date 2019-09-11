package bucles;

import java.util.Scanner;

public class bucle03 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		// Variable
		int num = 0;
		int suma = 0;
		
		do {
			// Petici�n de n�mero
			System.out.println ("Introduzca un n�mero mayor de 1.");
			
			num = numero.nextInt();
		} while (num <= 1);
		
		// Bucle para calcular la suma
		for (int i = 1; i <= num; i++) {
			suma += i;
		}
		
		// Resultado
		System.out.println("La suma de todos los n�meros hasta el n�mero introducido es " + suma);

		numero.close();
	}

}
