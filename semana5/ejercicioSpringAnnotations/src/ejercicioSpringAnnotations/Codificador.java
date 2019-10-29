package ejercicioSpringAnnotations;

import java.util.ArrayList;

public class Codificador {
	private IProcesar ip;
	private ICodificar ic;
	
	public Codificador(IProcesar ip, ICodificar ic) {
		this.ip = ip;
		this.ic = ic;
	}
	
	public String codificador(String cadena) {
		ArrayList<String> cadenaDiv = new ArrayList<String>();
		String resultado;
		
		// Divide en trozos.
		cadenaDiv = ip.dividir(cadena);
		
		
		// Codifica cada uno de los elementos.
		for(int i = 0; i < cadenaDiv.size(); i++) {
			cadenaDiv.set(i, ic.codificar(cadenaDiv.get(i)));
		}
		
		// Une los trozos.
		resultado = ip.unir(cadenaDiv);
		
		return resultado;
	}
	
	public String decodificador(String cadena) {
		ArrayList<String> cadenaDiv = new ArrayList<String>();
		String resultado;
		
		// Divide en trozos.
		cadenaDiv = ip.dividir(cadena);
				
				
		// Decodifica cada uno de los elementos.
		for(int i = 0; i < cadenaDiv.size(); i++) {
			cadenaDiv.set(i, ic.decodificar(cadenaDiv.get(i)));
		}
				
		// Une los trozos.
		resultado = ip.unir(cadenaDiv);
		
		return resultado;
	}

}
