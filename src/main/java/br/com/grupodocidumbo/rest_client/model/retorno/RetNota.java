package br.com.grupodocidumbo.rest_client.model.retorno;

public record RetNota(
  String success,
  String nota_id,
  String numero_nfse,
  String status,
  String pdf_url
) {

}
