package br.com.grupodocidumbo.rest_client.web.RestControllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupodocidumbo.rest_client.model.retorno.FormWeb;
import br.com.grupodocidumbo.rest_client.model.retorno.RetNota;


@RestController
@RequestMapping("/input")
public class InputFormController {

    @PostMapping
    public RetNota inicio(@RequestBody FormWeb formWeb){
     RetNota rn = new RetNota("Sem", "Sem", "Sem", "Sem", "Sem");
     return rn;
    }
}