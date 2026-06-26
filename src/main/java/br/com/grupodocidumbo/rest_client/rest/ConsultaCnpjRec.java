package br.com.grupodocidumbo.rest_client.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;


@HttpExchange(url = "/functions/v1/api-nfse/lookup/cnpj")
public interface ConsultaCnpjRec {

    
    @GetExchange("/{doc}")
    public String consultaCnpj (@PathVariable ("doc") String doc);
}
