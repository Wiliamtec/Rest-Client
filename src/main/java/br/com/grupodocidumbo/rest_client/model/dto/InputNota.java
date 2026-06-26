package br.com.grupodocidumbo.rest_client.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class InputNota {

  double valor;
  private String descricao;
  private String cliente_nome;
  private String cliente_documento;
  private String cliente_email;
  private String cliente_cep;
  private String cliente_logradouro;
  private String cliente_numero;
  private String cliente_bairro;
  private String cliente_cidade;
  private String cliente_uf;
  private String cliente_codigo_municipio;
  private String codigo_tributacao;
  private String codigo_tributacao_municipal;
  private String aliquota_sn;
  private String trib_issqn;
  private String tp_ret_issqn;

}
