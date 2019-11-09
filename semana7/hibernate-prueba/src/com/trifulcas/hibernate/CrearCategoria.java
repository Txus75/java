package com.trifulcas.hibernate;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.trifulcas.hibernate.entidades.Categorias;
import com.trifulcas.hibernate.entidades.Productos;
import com.trifulcas.hibernate.entidades.Proveedores;

public class CrearCategoria {

	public static void main(String[] args) {
		
		// Crear la configuraci�n cog�endola del xml y a�adiendo la clase Categorias
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Categorias.class);
		configuration.addAnnotatedClass(Productos.class);
		configuration.addAnnotatedClass(Proveedores.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		
		// Crear la factor�a de sesiones
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		
		// Crear la sesi�n
		Session session = factory.getCurrentSession();
		
		try {
			// Iniciar transacci�n
			session.beginTransaction();
			
			/*//// INSERT CATEGOR�A
			// Categorias cat = new Categorias("Cat2 desde hibernate");
			
			//// Guardar categor�a
			//session.save(cat);
			
			//// INSERT VARIAS CATEGOR�AS (A�ADIR @GeneratedValue(strategy=GenerationType.IDENTITY)) A LA CLASE
			//for(int i = 0; i < 10; i++) {
			//	Categorias cat = new Categorias("Cat" + i + " desde hibernate");
			//	// Guardar categor�a
			//	session.save(cat);
			//}
			
			//// Guardar categor�a
			//session.save(cat);
			
			// SELECT CATEGORIA POR ID
			Categorias cat = session.get(Categorias.class, 1);
			System.out.println(cat);
			// SELECT TODAS LAS CATEGORIAS CON LIKE
			@SuppressWarnings("unchecked")
			List<Categorias> lista = session.createQuery("FROM Categorias c WHERE c.nombre LIKE '%cat%' ").getResultList();
			for (Categorias c : lista) {
				System.out.println(c);
			}
			
			// UPDATE UN REGISTRO
			Categorias catUpdate = session.get(Categorias.class, 1);
			cat.setNombre("Deliciosas frutas");
			session.save(catUpdate);
			
			// DELETE UN REGISTRO
			Categorias catDelete = session.get(Categorias.class, 4);
			session.delete(catDelete);*/
			
			/*Productos tomate = new Productos("Tomate", "Rojo como el pecado", 10);
			Categorias cat = session.get(Categorias.class, 2);
			tomate.setCategoria(cat);
			session.save(tomate);
			
			Productos pimiento = new Productos("Pimiento", "Del Padr�n", 5);
			Productos coliflor = new Productos("Coliflor", "Blanca y radiante", 7);
			cat.addProductos(coliflor);
			cat.addProductos(pimiento);
			session.save(coliflor);
			session.save(pimiento);*/
			
			/*Productos prod = session.get(Productos.class, 1);
			System.out.println(prod);
			
			Categorias cat = session.get(Categorias.class, 1);
			System.out.println(cat);
			System.out.println(cat.getProductos());*/
			
			Proveedores paco= new Proveedores("Paco", "11111", "Turrunc�n");
			session.save(paco);
			Productos pepino = new Productos("Pepino", "Franc�s", 5);
			Productos endivia = new Productos("Endivia", "Nada envidiosa", 7);
			paco.addProducto(pepino);
			paco.addProducto(endivia);
			session.save(pepino);
			session.save(endivia);
			
			// commit de la transacci�n
			session.getTransaction().commit();
		} finally {
			factory.close();
		}

	}

}
