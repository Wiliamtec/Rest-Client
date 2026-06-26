package br.com.grupodocidumbo.rest_client.rest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

import br.com.grupodocidumbo.rest_client.model.dto.InputNota;
import br.com.grupodocidumbo.rest_client.model.retorno.RetNota;

@HttpExchange(url = "/functions/v1/api-nfse")
public interface EmitirNota {

    
    @PostExchange(contentType = "application/json")
    public RetNota Enviar (@RequestBody InputNota input);

}
