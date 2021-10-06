package br.senai.sp.jandira.app;

import java.awt.Color;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Criar Agência
		Agencia agencia = new Agencia();
		agencia.setNumero("7845-5");
		agencia.setGerente("Celso");
		agencia.setTelefone("4002-8922");
		agencia.setCidade("Jandira");
		
		
		//Criar o cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria da Silva");
		clienteMaria.setEmail("maria@terra.com.br");
		clienteMaria.setSalario(2000);
				
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setTitular(clienteMaria);
		contaMaria.setAgencia(agencia);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println("--->" + contaMaria.getTipo());
		
		// Criar o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro@ig.com.br");
		clientePedro.setSalario(1500);
		
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setTitular(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agencia);
		System.out.println("--->" + contaPedro.getTipo());
		
		//Criar o cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("ana@gomes.com.br");
		clienteAna.setSalario(1900);
		
		
		
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setTitular(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setAgencia(agencia);
		System.out.println("--->" + contaAna.getTipo());
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		// Depositar 100 Reais na conta da Maria
		contaMaria.depositar(200);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		// Sacar 100 Reais da conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("========== TRANSFERINDO ===========");
		System.out.println();
		
		// Transferir 200 Reais da 
		// conta da Maria para a conta do Pedro
		contaMaria.transferir(contaPedro, 2000);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		
	}

}
