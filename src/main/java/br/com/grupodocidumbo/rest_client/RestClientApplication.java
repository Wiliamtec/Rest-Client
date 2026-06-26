package br.com.grupodocidumbo.rest_client;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.grupodocidumbo.rest_client.model.common.JwtToken;
import br.com.grupodocidumbo.rest_client.rest.ConsultaCnpjRec;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class RestClientApplication  implements CommandLineRunner{
    private final ConsultaCnpjRec cnpjRec;
	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JwtToken.token = new String(Files.readAllBytes(Paths.get("C:/api/arq.txt")));	
	System.out.println(cnpjRec.consultaCnpj("03707640000124"));		
		
	}

}
