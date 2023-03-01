package kodlama.io.Devs;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevsApplication.class, args);
	}
	//uygulama açıldığında modelmapper üretmesini sağlayan kod
	
		@Bean
		public ModelMapper getModelMapper()
		{
			return new ModelMapper();
			
		}
}
