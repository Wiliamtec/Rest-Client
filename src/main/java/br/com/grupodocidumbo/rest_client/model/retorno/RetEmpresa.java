package br.com.grupodocidumbo.rest_client.model.retorno;

public record RetEmpresa(
    String cnpj,
    String razao_social,
    String nome_fantasia,
    String situacao,
    String data_abertura,
    String natureza_juridica,
    String porte,
    RetEndereco endereco,
    String telefone,
    String email

) {

}
