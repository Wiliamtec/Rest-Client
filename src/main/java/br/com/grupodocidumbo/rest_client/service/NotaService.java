package br.com.grupodocidumbo.rest_client.service;

import br.com.grupodocidumbo.rest_client.model.retorno.RetEmpresa;
import org.springframework.stereotype.Service;

import br.com.grupodocidumbo.rest_client.model.dto.InputNota;
import br.com.grupodocidumbo.rest_client.model.retorno.FormWeb;
import br.com.grupodocidumbo.rest_client.model.retorno.RetConsultaCnpj;
import br.com.grupodocidumbo.rest_client.model.retorno.RetNota;
import br.com.grupodocidumbo.rest_client.rest.ConsultaCnpjRec;
import br.com.grupodocidumbo.rest_client.rest.EmitirNota;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class NotaService {

   
    private final EmitirNota emitirNota;
    private final ConsultaCnpjRec consultaCnpjRec;

   

    public RetNota enviar(FormWeb formWeb){
       RetConsultaCnpj con = consultaCnpjRec.consultaCnpj(formWeb.cnpjouCpf());
       
       InputNota in = new InputNota();
       if (formWeb.cnpjouCpf().length()==14) {
          in.setCliente_nome(formWeb.nome());
          in.setCliente_documento(formWeb.cnpjouCpf());
          in.setDescricao(formWeb.descricao()+" | "+formWeb.placa());
         
          String vl =formWeb.valor().replace("R$", "").replace(",", ".");
          in.setValor(Double.parseDouble(vl));
          
          in.setCliente_logradouro(con.empresa().endereco().logradouro());       
          in.setCliente_bairro(con.empresa().endereco().bairro());
          in.setCliente_cidade(con.empresa().endereco().cidade());
          in.setCliente_cep(con.empresa().endereco().cep());
          in.setCliente_uf(con.empresa().endereco().uf());
          in.setCliente_codigo_municipio(con.empresa().endereco().codigo_municipio());
          in.setCliente_email(con.empresa().email());
        
       }else{
          in.setCliente_nome(formWeb.nome());
          in.setCliente_documento(formWeb.cnpjouCpf());
          in.setDescricao(formWeb.descricao()+" | "+formWeb.placa());
          String vl =formWeb.valor().replace("R$", "").replace(",", ".");
          in.setValor(Double.parseDouble(vl));
          in.setCliente_email(con.empresa().email());

       }

      return null;
    }

}
