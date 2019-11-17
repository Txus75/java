package es.txus.agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.txus.agenda.dao.IContactoDAO;
import es.txus.agenda.entity.Contacto;

@Service
public class ContactoService implements IContactoService {
	// PROPIEDAD DAO
	@Autowired
	private IContactoDAO contactoDAO;
	
	//MÉTODOS
	// VER CONTACTOS
	@Override
	@Transactional
	public List<Contacto> getContacto() {
		return contactoDAO.getContacto();
	}
	// GUARDAR CONTACTO
	@Override
	@Transactional
	public void save(Contacto contacto) {
		contactoDAO.save(contacto);
	}
	// VER CONTACTO POR ID
	@Override
	@Transactional
	public Contacto getContacto(int idContacto) {
		return contactoDAO.getContacto(idContacto);
	}
	// BORRAR CONTACTO
	@Override
	@Transactional
	public void delete(Contacto contacto) {
		contactoDAO.delete(contacto);
	}

}
