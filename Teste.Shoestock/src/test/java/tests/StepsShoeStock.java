package tests;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.TestFailure;
import pages.Metodos;

public class StepsShoeStock {
	
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	
	@Given("que eu acesse o {string}")
	public void que_eu_acesse_o(String url) {
		
		metodos.abrirNavegador(url, "CHROME");
	   
	}
	
	@When("eu preencher o campo de pesquisa clicar no produto clicar na cor clicar no tamanho e clicar em comprar {string} {string} {string}")
	public void eu_preencher_o_campo_de_pesquisa_clicar_no_produto_clicar_na_cor_clicar_no_tamanho_e_clicar_em_comprar(String pesquisa, String cor, String tamanho) throws InterruptedException, IOException {
		try {
			
			metodos.esperarPorElemento(elementos.campoBusca);
			metodos.esperar(2000);
			metodos.escrever(elementos.campoBusca, pesquisa);
			metodos.enter(elementos.btnBuscar);
			
		} catch (Exception e) {
			System.out.println("o erro foi encontrado no campo pesquisar ou btn clicar " + e);
		}
		
		try {
			metodos.esperarPorElemento(elementos.btnCookies);
			metodos.clicar(elementos.btnCookies);
			metodos.clicar(elementos.primeiroProduto);
			
			
		} catch (Exception e) {
			System.out.println("o erro foi encontrado no btnCookies ou primeiroProduto " + e);
		
		}
			
			metodos.esperarPorElemento(elementos.btnComprar);
		
			switch (tamanho) {
			case "38":
				try {
					metodos.clicar(elementos.tamanho38);
					metodos.esperar(1500);
					break;
					
				} catch (Exception e) {
					System.out.println("o erro foi encontrado no btn38 ao tentar comprar " + e);
				}
				
			case"39":
				try {
					metodos.clicar(elementos.tamanho39);
					metodos.esperar(1500);
					break;
					
				} catch (Exception e) {
					System.out.println("o erro foi encontrado no btn39 ao tentar comprar " + e);
				}
				
				
			case"40":
				try {
					metodos.clicar(elementos.tamanho40);
					metodos.esperar(1500);
					break;
					
				} catch (Exception e) {
					System.out.println("o erro foi encontrado no btn40 ao tentar comprar " + e);
					metodos.fecharNavegador();
				}
				
			}
			
			
				//Abaixo um Switch case para 3 tipos de cores, podemos fazer ate 3 testes com esse case, onde no nosso shoeStock.feature, onde colocarmos a cor igual a uma das opçoes abaixo ele ira prosseguir com a operação
				switch (cor) {
				case "cor1":
					try {
						metodos.clicar(elementos.cor1);
						metodos.esperar(1500);
						break;
						
					} catch (Exception e) {
						System.out.println("o erro foi encontrado ao clicar na opçao de cor 1 " + e);
						metodos.fecharNavegador();
					}
					
				case"cor2":
					try {
						metodos.clicar(elementos.cor2);
						metodos.esperar(1500);
						break;
						
					} catch (Exception e) {
						System.out.println("o erro foi encontrado ao clicar na opçao de cor 2 " + e);
						metodos.fecharNavegador();
					}
					
				case"cor3":
					try {
						metodos.clicar(elementos.cor3);
						metodos.esperar(1500);
						break;
						
					} catch (Exception e) {
						System.out.println("o erro foi encontrado ao clicar na opçao de cor 3 " + e);
						metodos.fecharNavegador();
					}
					
				}
				
				try {
						
						metodos.esperar(1000);
						metodos.clicar(elementos.btnComprar);
						//metodos.esperar(5000);			
					
				} catch (Exception e) {
					System.out.println("Nao foi encontrado o elemento btn comprar " + e);
					metodos.fecharNavegador();
				}
				
			
			
			
		
		
		
	}
	

	@Then("eu verififico o retorno apresentado na tela {string}")
	public void eu_verififico_o_retorno_apresentado_na_tela(String retorno) throws InterruptedException, IOException {
		
			try {
				    metodos.esperarPorElemento(elementos.retornoProduto);
					metodos.validarTexto(elementos.retornoProduto, retorno);
					metodos.esperar(1000);
					metodos.ScreenShot(retorno  );
					metodos.fecharNavegador();
				
			} catch (Exception e) {
				System.out.println("Provavelmente foi encontrado um erro: " + e);
				metodos.fecharNavegador();
			}
		   
			
			
		} 
		
	   
	
	
	
	
	
	
	
	
	

}
