package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Array de productos
		String [] productos;
		productos = new String[5];
		
		// Variables
		int cantidad = 0;
		String producto;
		
		// Petición de productos
		do {
			System.out.println ("Introduzca el nombre de un producto");
			
			producto = scan.nextLine();
			
			if (!Arrays.asList(productos).contains(producto)) {
				productos[cantidad] = producto;
				cantidad++;
			}
			
			
		} while (cantidad < 5);
		
		// Lista en pantalla de los productos introducidos
		for (String i : productos) {
			System.out.println(i);
		}
		
		scan.close();
	}

}
