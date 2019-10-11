package com.trifulcas.springprueba;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Cargar el contexto
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Pedir el bean
		Saludo miSaludo = context.getBean("miSaludo", Saludo.class);
				
		// Ejecutar alg�n m�todo
		System.out.println(miSaludo.hola());
		
		// Cerrar el contexto
		context.close();
	}

}
