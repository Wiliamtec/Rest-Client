package br.com.grupodocidumbo.rest_client.web.RestControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupodocidumbo.rest_client.model.retorno.RetConsultaCnpj;
import br.com.grupodocidumbo.rest_client.rest.ConsultaCnpjRec;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/pesquisa")
public class ConsultaParaWeb {

    private final ConsultaCnpjRec consultaCnpjRec;

    @GetMapping("/{doc}")
    public RetConsultaCnpj busca(@PathVariable String doc){
     return consultaCnpjRec.consultaCnpj(doc);    

    }

}
