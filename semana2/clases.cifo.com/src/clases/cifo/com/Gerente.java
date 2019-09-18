package clases.cifo.com;

public class Gerente extends Empleados {
	// Propiedades
	String departamento;
	int dietas;
	
	// Constructor
	public Gerente(String nombre, String dni, String departamento, int dietas) {
		super(nombre, dni);
		this.departamento = departamento;
		this.dietas = dietas;
	}

	// Seters y Geters
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getDietas() {
		return dietas;
	}

	public void setDietas(int dietas) {
		this.dietas = dietas;
	}
	
	// Metodos
	public Double sueldoNeto() {
		return (super.sueldoNeto() + dietas);
	}
}
