package solid;

import java.util.ArrayList;

public class Torneo {
	// Atributos
	private ArrayList<Participante> participantes = new ArrayList<Participante>();
	private String nombreTorneo;
	
	// Constructor
	public Torneo(ArrayList<Participante> asistentes, int numParticipantes, String nombreTorneo) {
		super();
		this.nombreTorneo = nombreTorneo;
		for(Participante i : asistentes) {
			participantes.add(i);
		}
	}

	// Setters y Getters
	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	public String getNombreTorneo() {
		return nombreTorneo;
	}

	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}
	
	// Metodos S: Principio de responsabilidad única
	/*public void clasificacion() {
		// Metodo de clasificación e impresión en pantalla
	}*/
}
