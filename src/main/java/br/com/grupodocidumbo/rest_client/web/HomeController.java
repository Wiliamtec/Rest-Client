package br.com.grupodocidumbo.rest_client.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;


import br.com.grupodocidumbo.rest_client.model.retorno.FormWeb;

import br.com.grupodocidumbo.rest_client.service.NotaService;
import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
public class HomeController {

    private final NotaService notaService;

    @GetMapping
    public String inicio(){
      
        return "home";
    }

   

}
