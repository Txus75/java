package ejercicioSpringAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ejercicioSpringAnnotations")
public class Config1 {
	
	@Bean
	public IProcesar palabras() {
		return new Palabras();
	}
	
	@Bean
	public ICodificar invertir() {
		return new Invertir();
	}
	
	@Bean
	public Codificador codificador() {
		return new Codificador(palabras(), invertir());
	}

}
