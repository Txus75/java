package clases.cifo.com;

public class Clientes implements Saludo {
	// Propiedades
	private String nombre;
	private String email;
	private String tipo;
	
	// Constructor
	public Clientes(String nombre, String email, String tipo) {
		this.nombre = nombre;
		this.email = email;
		this.tipo = tipo;
	}

	// Seters y Geters
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// Metodo
	public void saludo() {
		System.out.println("Hola " + nombre + ", bienvenido/a.");
	}
}
