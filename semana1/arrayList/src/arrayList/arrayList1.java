package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Creación de ArrayList
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		// Variable de control
		boolean control = true;
		int num;
		int suma = 0;
		
		// Petición de números
		do {
			System.out.println("Introduzca un número del 1 al 10, el programa terminará cuando introduzca \"0\".");
			
			num = scan.nextInt();
			
			// Control de 0
			if (num != 0) {
				numeros.add(num);
			} else {
				control = false;
			}
		} while (control);
		
		System.out.println("El ArrayList tiene " + numeros.size() + " elementos.");
		
		// Suma de los elementos del ArrayList
		for (int i : numeros) {
			suma += i;
		}
		
		System.out.println("La suma de los elementos es: " + suma + ".");
		
		// Números pares
		System.out.println("Los números pares son:");
		for (int i : numeros) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}
