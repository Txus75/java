package es.txus.instituto;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import es.txus.instituto.entidades.Alumno;
import es.txus.instituto.entidades.Modulo;
import es.txus.instituto.entidades.Profesor;

public class Main {

	public static void main(String[] args) {
		// CREAR LA CONFIGURACIÓN DESDE EL XML Y AÑADIDO DE LAS ENTIDADES
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Alumno.class);
		configuration.addAnnotatedClass(Modulo.class);
		configuration.addAnnotatedClass(Profesor.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		// CREAR LA FACTORÍA DE SESIONES
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
				
		// CREAR LA SESIÓN
		Session session = factory.getCurrentSession();
		
		try {
			// INICIAR TRANSACCIÓN
			session.beginTransaction();
			
			// SELECT ALUMNO POR ID
			/*Alumno al = session.get(Alumno.class, 1);
			System.out.println(al);*/
			
			// SELECT TODOS LOS ALUMNOS
			/*@SuppressWarnings("unchecked")
			List<Alumno> listaA = session.createQuery("FROM Alumno a ").getResultList();
			for (Alumno a : listaA) {
				System.out.println(a);
			}*/
			
			// INSERTAR DOS PROFESORES
			Profesor clark = new Profesor("78945612b", "Clark Kent", "c.kent@metropolis.com");
			session.save(clark);
			Profesor diana = new Profesor("14785369c", "Diana Prince", "d.prince@temiscira.com");
			session.save(diana);
			
			// INSERTAR DOS MÓDULOS Y ASIGNAR UN PROFESOR A CADA UNO
			Modulo html = new Modulo("HTML5");
			html.setProfesor(clark);
			session.save(html);
			Modulo css = new Modulo("CSS3");
			css.setProfesor(diana);
			session.save(css);
			
			// INSERTAR TRES ALUMNOS UNO PARA HTML Y DOS PARA CSS
			Alumno bruce = new Alumno("Bruce Wayne", "b.wyne@gotham.com");
			bruce.addModulo(html);
			session.save(bruce);
			Alumno dinah = new Alumno("Dinah Laurel", "d.laurel@star.com");
			dinah.addModulo(css);
			session.save(dinah);
			Alumno barry = new Alumno("Barry Allen", "b.allen@central.com");
			barry.addModulo(css);
			session.save(barry);
			
			// COMMIT DE LA TRANSACCIÓN
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

}
