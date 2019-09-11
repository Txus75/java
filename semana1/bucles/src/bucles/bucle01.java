package bucles;

import java.util.Scanner;

public class bucle01 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num;
		
		do {
			// Petición de número
			System.out.println ("Introduzca un número del 1 al 10");
			
			num = numero.nextInt();
		} while (num < 1 || num > 10);
		
		System.out.println("El número elegido es " + num);
		
		numero.close();
	}

}
