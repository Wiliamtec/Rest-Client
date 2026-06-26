package br.com.grupodocidumbo.rest_client.model.dto;

public record InputNota(
  String valor,
  String descricao,
  String cliente_nome,
  String cliente_documento,
  String cliente_email,
  String cliente_cep,
  String cliente_logradouro,
  String cliente_numero,
  String cliente_bairro,
  String cliente_cidade,
  String cliente_uf,
  String cliente_codigo_municipio,
  String codigo_tributacao,
  String codigo_tributacao_municipal,
  String aliquota_sn,
  String trib_issqn,
  String tp_ret_issqn
) {

}
