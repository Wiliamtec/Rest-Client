package br.com.grupodocidumbo.rest_client;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.grupodocidumbo.rest_client.model.common.JwtToken;

@SpringBootApplication
public class RestClientApplication  implements CommandLineRunner{
   
	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JwtToken.token = new String(Files.readAllBytes(Paths.get("C:/api/arq.txt")));		
		
	}

}
