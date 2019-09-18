package clases.cifo.com;

public class Direccion extends Empleados {
	// Propiedades
	int stockOptions;

	// Constructor
	public Direccion(String nombre, String dni, int stockOptions) {
		super(nombre, dni);
		this.stockOptions = stockOptions;
	}

	// Seters y Geters
	public int getStockOptions() {
		return stockOptions;
	}

	public void setStockOptions(int stockOptions) {
		this.stockOptions = stockOptions;
	}
	
	// Metodos
	public Double sueldoNeto() {
		return (super.sueldoNeto() + (stockOptions * 0.1));
	}
}
