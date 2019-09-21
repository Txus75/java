package JuegoCartas;

import java.util.ArrayList;
import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Variables
		int juego;
		boolean control = true;
		ArrayList<String> jugadores = new ArrayList<String>();
		
		// Elecci�n de juego
		do {
			System.out.println("Elija un juego (1 - Mus, 2 - Poker):");
			
			juego = scan.nextInt();
			scan.nextLine();
			
			if(juego == 1) {
				// Creaci�n de 4 jugadores de mus
				for (int i = 1; i <= 4; i++) {
					String nombre;
					boolean controlMus = true;
					
					// Comprobaci�n de nombre
					do {
						System.out.println("Introduzca el nombre del jugador n�mero " + i + ":");
						
						nombre = scan.nextLine();
						
						nombre.trim();
						
						if (nombre.length() > 0) {
							jugadores.add(nombre);
							controlMus = false;
						} else {
							System.out.println("El nombre no es correcto.");
						}
						
					} while(controlMus);
					
				}
				
				Mus partida = new Mus(jugadores);
				
				partida.repartir();
				
				partida.verJuego();
				
				control = false;
				
			} else if(juego == 2) {
				// Creaci�n de jugadores de poker
				int numJug;
				
				// Numero de jugadores (m�s de 2)
				do {
					System.out.println("Introduzca el n�mero de jugadores, han de ser m�s de 2:");
					
					numJug = scan.nextInt();
					scan.nextLine();
					
				} while(numJug <= 2);
				
				// Comprobaci�n de nombres
				for (int i = 1; i <= numJug; i++) {
					String nombre;
					boolean controlPoker = true;
					
					do {
						System.out.println("Introduzca el nombre del jugador n�mero " + i + ":");
						nombre = scan.nextLine();
						
						nombre.trim();
						
						if (nombre.length() > 0) {
							jugadores.add(nombre);
							controlPoker = false;
						} else {
							System.out.println("El nombre no es correcto.");
						}
					} while(controlPoker);
				}

				Poker partida = new Poker(jugadores);
				
				partida.repartir();
				
				partida.verJuego();

				control = false;
				
			} else {
				// Valor no v�lido
				System.out.println("Valor no v�lido.");
			}
		} while(control);
		
		scan.close();
	}

}
