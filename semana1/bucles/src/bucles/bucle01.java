package bucles;

import java.util.Scanner;

public class bucle01 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int num;
		
		do {
			// Petici�n de n�mero
			System.out.println ("Introduzca un n�mero del 1 al 10");
			
			num = numero.nextInt();
		} while (num < 1 || num > 10);
		
		System.out.println("El n�mero elegido es " + num);
		
		numero.close();
	}

}
