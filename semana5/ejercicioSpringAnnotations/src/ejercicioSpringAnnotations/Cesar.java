package ejercicioSpringAnnotations;

import org.springframework.stereotype.Component;

@Component
public class Cesar implements ICodificar {

	@Override
	public String codificar(String cadena) {
		cadena = cadena.toUpperCase();
		StringBuilder cifrado = new StringBuilder();
        int codigo = 2;
        
        for (int i = 0; i < cadena.length(); i++) {
        	if ((cadena.charAt(i) + codigo) > 'Z') {
        		cifrado.append((char) (cadena.charAt(i) + codigo - 26));
        	} else {
        		cifrado.append((char) (cadena.charAt(i) + codigo));
        	}
        }
		
		return cifrado.toString();
	}

	@Override
	public String decodificar(String cadena) {
		cadena = cadena.toUpperCase();
		StringBuilder cifrado = new StringBuilder();
        int codigo = 2;
        
        for (int i = 0; i < cadena.length(); i++) {
        	if ((cadena.charAt(i) - codigo) < 'A') {
        		cifrado.append((char) (cadena.charAt(i) - codigo + 26));
        	} else {
        		cifrado.append((char) (cadena.charAt(i) - codigo));
        	}
        }
        
        return cifrado.toString();
	}

}
