package clases.cifo.com;

public class Administracion extends Empleados {
	// Propiedades
	String seccion;

	// Constructor
	public Administracion(String nombre, String dni, String seccion) {
		super(nombre, dni);
		this.seccion = seccion;
	}

	// Seters y Geters
	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
}
