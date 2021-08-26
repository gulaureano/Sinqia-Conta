package application;

import java.time.LocalDate;

import entities.cliente.Cliente;
import entities.conta.Conta;
import entities.conta.ContaCorrente;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class ProgramE2 {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = new String("Hello");
		
		inteirosIguais(1, 2);
		
		stringIguaisComEquals(a, b);
		
		stringIguaisSemEquals(a, b);
		
		//AQUI PODEMOS OBSERVAR QUE O EQUAL() VERIFICA O CONTEÚDO E O == VERIFICA O ENDEREÇO DE MEMORIA, SE OS
		//OBJETOS APONTAM PARA O MESMO LUGAR, SENDO ASSIM PARA CALCULAR SE DUAS CONTAS E CLIENTES SÃO IGUAIS
		//TEREMOS QUE VER SE OS NUMEROS DE SEUS DADOS SÃO IGUAIS, UTILIZANDO O MAIS ADEQUADO EQUALS()
		
		Cliente cliente1 = new Cliente("Gustavo", 1001, 780.0, TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Geovane", 1002, 894.0, TipoCliente.SERVIDOR_PUBLICO);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("Itau", 45, 9090, 9, 1000.0, LocalDate.now(), cliente2, 0.25, 2, 5);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", 37, 8080, 7, 1000.0, LocalDate.parse("2018-10-07"), cliente1, 4, 4);
		
		clientesIguais(cliente1, cliente2);
		
		contasIguais(contaPoupanca, contaCorrente);
		
		
	}
	
	public static void inteirosIguais(int a, int b) {
		if (a == b) {
			System.out.println("Os números são iguais :)");
		}
		else {
			System.out.println("Os números não são iguais :(");
		}
	}
	
	public static void stringIguaisComEquals(String a, String b){
		if (a.equals(b)){
			System.out.println("Nesse metodo com Equals() as Strings são iguais");
		}
		else {
			System.out.println("Nesse metodo com Equals() as Strings não são iguais");
		}
	}
	
	public static void stringIguaisSemEquals(String a, String b) {
		if (a == b) {
			System.out.println("Nesse metodo com == as Strings são iguais");
		}
		else {
			System.out.println("Nesse metodo com == as Strings não são iguais");
		}
	}
	
	public static void clientesIguais(Cliente cliente1, Cliente cliente2){
		if (cliente1.getNumeroDocumentoCliente().equals(cliente2.getNumeroDocumentoCliente())) {
			System.out.println("Usando o método equals(), os clientes são iguais");
		}
		else {
			System.out.println("Usando o método equals(), os clientes não são iguais");
		}
	}
	
	public static void contasIguais(Conta conta1, Conta conta2) {
		if (conta1.getNumeroConta().equals(conta2.getNumeroConta()) && conta1.getNumeroAgencia().equals(conta2.getNumeroAgencia())) {
			System.out.println("Usando o método equals(), as contas são iguais");
		}
		else {
			System.out.println("Usando o método equals(), as contas não são iguais");
		}
	}
}
