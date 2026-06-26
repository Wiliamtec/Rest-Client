package br.com.grupodocidumbo.rest_client.model.retorno;

public record FormWeb(
    String cnpjouCpf,
    String nome,
    String descricao,
    String placa,
    String valor
) {

}
