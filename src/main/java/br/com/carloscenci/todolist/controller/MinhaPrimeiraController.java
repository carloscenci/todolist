package br.com.carloscenci.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {
  
  /** 
   * Métodos de acesso do HTTP
   * GET - Buscar uma informação
   * POST - Adicionar um dado / informação
   * PUT - Alterar um dado / informação
   * DELETE - Deletar um dado / informação
   * PATCH - Alterar somente uma parte da informação / dado
   */

  //  Método (Funcionalidade) de uma classe
  @GetMapping("/primeiroMetodo")
  public String primeiraMensagem() {
    return "Funcionou";
  }
}
