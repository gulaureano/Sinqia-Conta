package application;

import java.time.LocalDate;

import entities.cliente.Cliente;
import entities.conta.ContaCorrente;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class ProgramE2 {

	public static void main(String[] args) {
		//AQUI TEMOS O SEGUNDO EXERCICIO QUE MOSTRA A PEQUENA DIFEREN�A ENTRE USAR DOIS METODOS QUE TEORICAMENTE
//		FAZEM A MESMA COISA
		
		String a = "Hello";
		String b = new String("Hello");
		
		
		inteirosIguais(1, 2);
		inteirosIguais(2, 2);
		
		stringIguaisComEquals(a, b);
		
		stringIguaisSemEquals(a, b);
		
		//AQUI PODEMOS OBSERVAR QUE O EQUAL() VERIFICA O CONTE�DO E O == VERIFICA O ENDERE�O DE MEMORIA, SE OS
		//OBJETOS APONTAM PARA O MESMO LUGAR, SENDO ASSIM PARA CALCULAR SE DUAS CONTAS E CLIENTES S�O IGUAIS
		//TEREMOS QUE VER SE OS NUMEROS DE SEUS DADOS S�O IGUAIS, UTILIZANDO O MAIS ADEQUADO EQUALS(), O ==
		//QUANDO S�O PRIMITIVOS COMPARA O CONTE�DO
		
		Cliente cliente1 = new Cliente("Gustavo", 1001, 780.0, TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Geovane", 1002, 894.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente cliente3 = new Cliente("Geovane", 1002, 894.0, TipoCliente.SERVIDOR_PUBLICO);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("Itau", "45", "9090", "9", 1000.0, LocalDate.now(), null, null, cliente2, 0.25, 2, 5);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", "37", "8080", "7", 1000.0, LocalDate.parse("2018-10-07"), null, null, cliente1, 4, 4);
		ContaCorrente contaCorrente1 = new ContaCorrente("NuBank", "37", "8080", "7", 1000.0, LocalDate.parse("2018-10-07"), null, null, cliente1, 4, 4);
		
		cliente1.equals(cliente2);
		cliente2.equals(cliente3);
		
		System.out.println(contaCorrente.equals(contaPoupanca));
		System.out.println(contaCorrente.equals(contaCorrente1));
		
		/*AQUI COMO VEMOS, VERIFICAMOS CLIENTES E CONTAS EXATAMENTE IGUAIS E CLIENTES E CONTAS DIFERENTES
		 * POR�M, EU COLOQUEI QUE PARA SER IGUAL, VAI IMPORTAR APEENAS A AGENCIA E CONTA, IGNORANDO O RESTO*/
	}
	
	public static void inteirosIguais(int a, int b) {
		if (a == b) {
			System.out.println("Os n�meros s�o iguais :)");
		}
		else {
			System.out.println("Os n�meros n�o s�o iguais :(");
		}
	}
	
	public static void stringIguaisComEquals(String a, String b){
		if (a.equals(b)){
			System.out.println("Nesse metodo com Equals() as Strings s�o iguais");
		}
		else {
			System.out.println("Nesse metodo com Equals() as Strings n�o s�o iguais");
		}
	}
	
	public static void stringIguaisSemEquals(String a, String b) {
		if (a == b) {
			System.out.println("Nesse metodo com == as Strings s�o iguais");
		}
		else {
			System.out.println("Nesse metodo com == as Strings n�o s�o iguais");
		}
	}
}
