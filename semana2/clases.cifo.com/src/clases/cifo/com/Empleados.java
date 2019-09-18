package clases.cifo.com;


public class Empleados implements Saludo {
	// Propiedades
	private String nombre;
	private String dni;
	private Double sueldo = 0.00;
	
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

	// Metodos
	private Double getIRPF(Double sueldo) {
		if (sueldo < 3000) {
			return 0.85;
		} else {
			return 0.75;
		}
	}
	
	public Double sueldoNeto() {
		return (this.sueldo * getIRPF(this.sueldo));
	}
	
	public void saludo() {
		System.out.println("Hola " + nombre + ".");
	}
}
