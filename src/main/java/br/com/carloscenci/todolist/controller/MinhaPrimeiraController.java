package br.com.carloscenci.todolist.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController 
public class MinhaPrimeiraController {
  
  
  /** 
   * Métodos de acesso do HTTP
   * GET - Buscar uma informação
   * POST - Adicionar um dado / informação
   * PUT - Alterar um dado / informação
   * DELETE - Deletar um dado / informação
   * PATCH - Alterar somente uma parte da informação / dado
   */

  //  Método de uma classe
  public String primeiraMensagem() {
    return "Funcionou";
  }
}
