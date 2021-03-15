#Author: your.email@your.domain.com

@Executa
Feature: Validar Funcionalidade pedidas no teste da yaman
  Eu como usuario quero Acessar o site da Shoestock para Validar a compra de produtos

  Scenario: Validar Realizar Busca
    Given que eu acesse o "https://www.shoestock.com.br/"
    When eu preencher o campo de pesquisa clicar no produto clicar na cor clicar no tamanho e clicar em comprar <pesquisa> <cor> <tamanho>
    Then eu verififico o retorno apresentado na tela <retorno>

    Examples: 
      |pesquisa          |cor        |tamanho    |retorno                                             | 
    	|"O01-4359-000-33" |"cor2"     | "39"      |"Mocassim Couro Shoestock Tratorado Feminino"       |
     