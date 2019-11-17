package es.txus.agenda.service;

import java.util.List;

import es.txus.agenda.entity.Contacto;

public interface IContactoService {
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
