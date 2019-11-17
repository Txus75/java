package es.txus.agenda.dao;

import java.util.List;

import es.txus.agenda.entity.Contacto;

public interface IContactoDAO {
	//MÉTODOS
	// VER CONTACTOS
	List<Contacto> getContacto();
	// GUARDAR CONTACTO
	void save(Contacto contacto);
	// VER CONTACTO POR ID
	Contacto getContacto(int idContacto);
	// BORRAR CONTACTO
	void delete(Contacto contacto);

}
