package clases;

public class Empleados {
	// Propiedades
	private String nombre;
	private String dni;
	private Double sueldo;
	
	// Constructor
	public Empleados(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	// Seters y Geters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	// Metodo
	public Double sueldoNeto() {
		return (sueldo * 0.85);
	}
}
