package es.txus.agenda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.txus.agenda.entity.Contacto;
import es.txus.agenda.service.IContactoService;

@Controller
//@RequestMapping("/agenda")
public class ContactoController {
	// PROPIEDAD SERVICE
	@Autowired
	private IContactoService contactoService;

	// MÉTODOS
	// LISTADO DE CONTACTOS
	//@RequestMapping("/lista")
	@RequestMapping("/")
	public String lista(Model modelo) {
		List<Contacto> contactos = contactoService.getContacto();
		modelo.addAttribute("contacto", contactos);
		return "lista-contactos";
	}
	
	// AÑADIR CONTACTO (FORMULARIO)
	@GetMapping("/addcontacto")
	public String addContacto(Model modelo) {
		Contacto contacto = new Contacto();
		modelo.addAttribute("contacto", contacto);
		return "form-contacto";
	}
	
	// GUARDAR CONTACTO
	@PostMapping("/savecontacto")
	public String saveContacto(@ModelAttribute("contacto") Contacto contacto) {
		contactoService.save(contacto);
		//return "redirect:/agenda/lista";
		return "redirect:/";
	}
	
	// ACTUALIZAR CONTACTO
	@GetMapping("updatecontacto") 
	public String updateContacto(@RequestParam("idContacto") int idContacto, Model modelo) {
		Contacto contacto = contactoService.getContacto(idContacto);
		modelo.addAttribute("contacto", contacto);
		return "form-contacto";
	}
	
	// BORRAR CONTACTO
	@GetMapping("deletecontacto")
	public String deleteContacto(@RequestParam("idContacto") int idContacto) {
		Contacto contacto = contactoService.getContacto(idContacto);
		contactoService.delete(contacto);
		//return "redirect:/agenda/lista";
		return "redirect:/";
	}
}
