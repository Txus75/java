package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays1 {
	
	static int sumaArray(int[] nums) {
		// Variable
		int suma = 0;
		
		// Suma
		for (int i = 0; i < nums.length; i++) {
			suma += nums[i];
		}
		
		// Devoluci�n
		return suma;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Variable
		int resultado;
		
		// Array
		int[] numeros;
		numeros = new int[10];
		
		// Petici�n de n�meros
		for (int i = 0; i < 10; i++) {
			System.out.println ("Introduzca un n�mero del 1 al 10.");
			
			numeros[i] = scan.nextInt();
		}
		
		// Llamada al m�todo de suma
		resultado = sumaArray(numeros);
		
		// Impresi�n en pantalla
		System.out.println("La suma de los valores del array es " + resultado);
		
		// Impresion del array ordenado
		Arrays.sort(numeros);
		for (int i = numeros.length-1; i >= 0; i--) {
			System.out.print(numeros[i] + " ");
		}
		
		scan.close();
	}

}
