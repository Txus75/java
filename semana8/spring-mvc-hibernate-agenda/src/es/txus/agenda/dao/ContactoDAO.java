package es.txus.agenda.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.txus.agenda.entity.Contacto;

@Repository
public class ContactoDAO implements IContactoDAO {
	// PROPIEDAD sessionFactory
	@Autowired
	private SessionFactory sessionFactory;
	
	//MÉTODOS
	// VER CONTACTOS
	@Override
	public List<Contacto> getContacto() {
		Session miSesion = sessionFactory.getCurrentSession();
		List<Contacto> contactos = miSesion.createQuery("FROM Contacto ORDER BY nombre", Contacto.class).list();
		return contactos;
	}
	// GUARDAR o ACTUALIZAR CONTACTO
	@Override
	public void save(Contacto contacto) {
		Session miSesion = sessionFactory.getCurrentSession();
		miSesion.saveOrUpdate(contacto);
	}
	// VER CONTACTO POR ID
	@Override
	public Contacto getContacto(int idContacto) {
		Session miSesion = sessionFactory.getCurrentSession();
		return miSesion.get(Contacto.class, idContacto);
	}
	// BORRAR CONTACTO
	@Override
	public void delete(Contacto contacto) {
		Session miSesion = sessionFactory.getCurrentSession();
		miSesion.delete(contacto);
	}

}
