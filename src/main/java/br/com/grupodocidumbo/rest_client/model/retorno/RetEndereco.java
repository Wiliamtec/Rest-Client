package br.com.grupodocidumbo.rest_client.model.retorno;

public record RetEndereco(
     String logradouro,
     String numero,
     String complemento,
     String bairro,
     String cidade,
     String uf,
     String cep,
     String codigo_municipio
     
) {

}
