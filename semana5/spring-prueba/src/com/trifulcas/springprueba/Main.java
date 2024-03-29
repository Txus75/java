package com.trifulcas.springprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir el bean
		//Saludos miSaludo = context.getBean("miSaludo", Saludos.class);
		Saludos miSaludo = context.getBean("miSaludo", Saludos.class);
		Saludos otroSaludo= context.getBean("miSaludo", Saludos.class);
		
		//Los dos son iguales (SIngleton por defecto)
		System.out.println(miSaludo.equals(otroSaludo));
		
		//Y apuntan a la misma direcci�n de memoria
		System.out.println(miSaludo);
		System.out.println(otroSaludo);
		
		// Ejecutar alg�n m�todo
		System.out.println(miSaludo.hola());
		System.out.println(miSaludo.adios());
		
		/*// Pedir el bean
		Vecino miVecino = context.getBean("miVecino", Vecino.class);
		
		// Ejecutar alg�n m�todo
		System.out.println(miVecino.hola());
		System.out.println(miVecino.adios());*/
		
		// Cerrar el contexto
		context.close();
	}

}
