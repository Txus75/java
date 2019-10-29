package ejercicioSpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Invertir implements ICodificar {

	@Override
	public String codificar(String cadena) {
		String cod = "";
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cod = cod + cadena.charAt(i);
		}
			
		return cod;
	}

	@Override
	public String decodificar(String cadena) {
		String decod = "";
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			decod = decod + cadena.charAt(i);
		}
		
		return decod;
	}

}
