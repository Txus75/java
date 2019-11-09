package es.txus.instituto.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profesores")
public class Profesor {
	// PROPIEDADES
	@Id
	@Column(name = "idprofesor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idprofesor;
	@Column(name = "dni")
	private String dni;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "email")
	private String email;
	@OneToMany(mappedBy = "profesor", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	private List<Modulo> modulos;
	
	// CONSTRUCTORES
	public Profesor() {
		
	}
	public Profesor(String dni, String nombre, String email) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
	}

	// GETTERS Y SETTERS
	public int getIdprofesor() {
		return idprofesor;
	}
	public void setIdprofesor(int idprofesor) {
		this.idprofesor = idprofesor;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Modulo> getModulos() {
		return modulos;
	}
	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	// MÉTODOS
	public void addModulo(Modulo modulo) {
		if(modulos == null) {
			modulos = new ArrayList<Modulo>();
		}
		modulos.add(modulo);
	}
	@Override
	public String toString() {
		String mods = "";
		for(Modulo m: modulos) {
			mods += m.getNombre() + " / ";
		}
		return "Profesor: [idprofesor = " + idprofesor + ",dni = " + dni + ", nombre = " + nombre + ", e-mail = " + email + ", modulos = " + mods + "]\n";
	}

}
