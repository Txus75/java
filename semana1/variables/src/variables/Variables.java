package variables;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		// Variables de clase integer
		int num1;
		int num2;
		
		// Petici�n del primer n�mero
		System.out.println ("Introduzca un n�mero");
		
		num1 = numero.nextInt();
		
		// Petici�n del segundo n�mero
		System.out.println ("Introduzca otro n�mero");
		
		num2 = numero.nextInt();
		
		// Resultados de la suma y la multiplicaci�n
		System.out.println("La suma de los dos n�mero es " + (num1 + num2));
		System.out.println("La multiplicaci�n de los dos n�mero es " + (num1 * num2));
		
		numero.close();
	}

}
