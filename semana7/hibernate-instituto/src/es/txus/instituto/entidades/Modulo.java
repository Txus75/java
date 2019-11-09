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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "modulos")
public class Modulo {
	// PROPIEDADES
	@Id
	@Column(name = "idmodulo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idmodulo;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinColumn(name = "idprofesor")
	private Profesor profesor;
	@Column(name = "nombre")
	private String nombre;
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH }, fetch = FetchType.LAZY)
	@JoinTable(name = "mod_alu", joinColumns = @JoinColumn(name="idmodulo"), inverseJoinColumns = @JoinColumn(name="idalumno"))
	private List<Alumno> alumnos;
	
	// CONSTRUCTORES
	public Modulo() {
		
	}
	public Modulo(String nombre) {
		super();
		this.nombre = nombre;
	}

	// GETTERS Y SETTERS
	public int getIdmodulo() {
		return idmodulo;
	}
	public void setIdmodulo(int idmodulo) {
		this.idmodulo = idmodulo;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	// MÉTODOS
	public void addAlumno(Alumno alumno) {
		if(alumnos == null) {
			alumnos = new ArrayList<Alumno>();
		}
		alumnos.add(alumno);
	}
	public String toString() {
		String alums = "";
		for(Alumno a: alumnos) {
			alums += a.getNombre() + " / ";
		}
		return "Módulo: [idmodulo = " + idmodulo + ", profesor = " + profesor.getNombre() + ", alumnos = " + alums + "]\n";
	}

}
