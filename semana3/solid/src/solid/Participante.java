package solid;

public class Participante {
	// Atributos
	private String nombre;
	private int puntuacion = 0;
	
	// Constructor
	public Participante(String nombre) {
		super();
		this.nombre = nombre;
	}

	// Setters y Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPuntuacion() {
		return puntuacion;
	}
	
	// Metodos
	public void anadirPuntos(int puntos) {
		puntuacion += puntos;
	}
}
