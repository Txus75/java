package com.trifulcas.springprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// Cargar el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir el bean
		Saludos miSaludo = context.getBean("miSaludo", Saludos.class);
		
		// Ejecutar alg�n m�todo
		System.out.println(miSaludo.hola());
		
		/*// Pedir el bean
		ISaludo miVecino = context.getBean("vecino", Vecino.class);
		
		// Ejecutar alg�n m�todo
		System.out.println(miVecino.hola());*/
		
		// Cerrar el contexto
		context.close();

	}

}
