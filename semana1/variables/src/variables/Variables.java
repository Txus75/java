package variables;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		// Variables de clase integer
		int num1;
		int num2;
		
		// Petición del primer número
		System.out.println ("Introduzca un número");
		
		num1 = numero.nextInt();
		
		// Petición del segundo número
		System.out.println ("Introduzca otro número");
		
		num2 = numero.nextInt();
		
		// Resultados de la suma y la multiplicación
		System.out.println("La suma de los dos número es " + (num1 + num2));
		System.out.println("La multiplicación de los dos número es " + (num1 * num2));
		
		numero.close();
	}

}
