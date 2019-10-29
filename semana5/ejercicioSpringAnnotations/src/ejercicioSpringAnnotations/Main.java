package ejercicioSpringAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		// PRUEBA DE CONFIGURACIÓN 1
		// Cargar el contexto
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Config1.class);
				
		// Pedir el bean.
		Codificador codificar1 = context1.getBean("codificador", Codificador.class);
		
		// Prueba
		System.out.println(codificar1.codificador("Prueba de Spring con Palabras e Invertir"));
		
		// Cerrar el contexto
		context1.close();
		
		// PRUEBA DE CONFIGURACIÓN 2
		// Cargar el contexto
		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(Config2.class);
						
		// Pedir el bean.
		Codificador codificar2 = context2.getBean("codificador", Codificador.class);
				
		// Prueba
		System.out.println(codificar2.codificador("Prueba de Spring con Palabras y Cesar"));
				
		// Cerrar el contexto
		context2.close();
		
	}

}
