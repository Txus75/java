package ejercicioSpringAnnotations;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Bloques implements IProcesar {

	@Override
	public ArrayList<String> dividir(String cadena) {
		ArrayList<String> bloquesDivididos = new ArrayList<String>();
		
		for(int i = 0, f = i + 4; i < cadena.length(); i += 4, f += 4) {
			if(f > cadena.length()) {
				f = cadena.length();
			}
			bloquesDivididos.add(cadena.substring(i, f));
		}
		
		return bloquesDivididos;
	}

	@Override
	public String unir(ArrayList<String> cadenas) {
		return String.join("", cadenas);
	}

}
