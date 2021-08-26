package application;

import java.time.LocalDate;

import entities.cliente.Cliente;
import entities.conta.ContaCorrente;
import entities.conta.ContaEmpresarial;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class ProgramE3 {

	public static void main(String[] args) {
		Cliente clienteCassilas = new Cliente("Casillas", 1001, 778.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteBuffon = new Cliente("Buffon", 1002, 550.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteDida = new Cliente("Dida", 123456789, 780.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteRogerioCeni = new Cliente("Rogerio Ceni", 55666, 970.0, TipoCliente.FUNCIONARIO_BANCO);
		Cliente clienteMarcos = new Cliente("Marcos", 435565478, 320.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteCassio = new Cliente("Cassio", 1003, 750.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteWeverton = new Cliente("Weverton", 121213, 780.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente clienteTiagoVolpi = new Cliente("Tiago Volpi", 5649877, 780.0, TipoCliente.PESSOA_JURIDICA);

		// INSTANCIADOS TRÊS TIPOS DE CONTA E EM CADA UMA COLOCANDO UM CLIENTE
		ContaPoupanca contaPoupancaCassilas = new ContaPoupanca("Itau", 89, 1001, 2, 1000.0,
				LocalDate.parse("2003-04-04"), clienteCassilas, 0.5, 3, 4);
		ContaCorrente contaCorrenteBuffon = new ContaCorrente("Itau", 89, 1001, 2, 2000.0,
				LocalDate.parse("1997-10-05"), clienteBuffon, 5, 5);
		ContaEmpresarial contaEmpresarialDida = new ContaEmpresarial("Nubank", 43, 3467, 7, 10000.0,
				LocalDate.parse("2002-07-20"), clienteDida, "Milan");
		ContaPoupanca contaPoupancaRogerioCeni = new ContaPoupanca("Bradesco", 67, 2001, 2, 1500.0,
				LocalDate.parse("1992-07-04"), clienteRogerioCeni, 0.5, 3, 4);
		ContaCorrente contaCorrenteMarcos = new ContaCorrente("Nubank", 43, 3468, 7, 2000.0,
				LocalDate.parse("1999-06-05"), clienteMarcos, 5, 5);
		ContaEmpresarial contaEmpresarialCassio = new ContaEmpresarial("C6 Bank", 23, 9800, 9, 50000.0,
				LocalDate.parse("2012-07-13"), clienteCassio, "Corinthians");
		ContaPoupanca contaPoupancaWeverton = new ContaPoupanca("Neon", 81, 4000, 1, 3000.0,
				LocalDate.parse("2020-04-04"), clienteWeverton, 0.6, 3, 4);
		ContaCorrente contaCorrenteTiagoVolpi = new ContaCorrente("Neon", 81, 4001, 1, 2500.0,
				LocalDate.parse("2017-05-05"), clienteTiagoVolpi, 5, 5);
		ContaEmpresarial contaEmpresarialCassilas = new ContaEmpresarial("Itau", 89, 1003, 6, 70000.0,
				LocalDate.parse("2003-04-04"), clienteCassilas, "Real Madrid");
		ContaPoupanca contaPoupancaBuffon = new ContaPoupanca("C6 Bank", 23, 9801, 9, 3560.0,
				LocalDate.parse("1997-10-05"), clienteBuffon, 0.45, 3, 4);
		ContaCorrente contaCorrenteDida = new ContaCorrente("Neon", 81, 4002, 5, 4789.0, LocalDate.parse("2002-07-20"),
				clienteDida, 5, 5);
		ContaEmpresarial contaEmpresarialRogerioCeni = new ContaEmpresarial("Bradesco", 67, 2002, 6, 70000.0,
				LocalDate.parse("1992-07-04"), clienteRogerioCeni, "São Paulo");
		ContaPoupanca contaPoupancaMarcos = new ContaPoupanca("Bradesco", 67, 2003, 9, 5000.0,
				LocalDate.parse("1999-06-05"), clienteMarcos, 0.35, 3, 4);
		ContaCorrente contaCorrenteCassio = new ContaCorrente("C6 Bank", 23, 9802, 4, 3789.0,
				LocalDate.parse("2012-07-13"), clienteCassio, 5, 5);
		ContaEmpresarial contaEmpresarialWeverton = new ContaEmpresarial("Nubank", 43, 3469, 6, 90000.0,
				LocalDate.parse("2020-04-04"), clienteWeverton, "Palmeiras");
		ContaPoupanca contaPoupancaTiagoVolpi = new ContaPoupanca("Bradesco", 67, 2004, 9, 9000.0,
				LocalDate.parse("2017-05-05"), clienteTiagoVolpi, 0.25, 3, 4);
		ContaCorrente contaCorrenteCassilas = new ContaCorrente("Itau", 89, 1004, 4, 6000.0,
				LocalDate.parse("2003-04-04"), clienteCassilas, 5, 5);
		ContaEmpresarial contaEmpresarialBuffon = new ContaEmpresarial("Neon", 81, 4003, 2, 200000.0,
				LocalDate.parse("1997-10-05"), clienteBuffon, "Juventus");
		ContaPoupanca contaPoupancaDida = new ContaPoupanca("Bradesco", 67, 2005, 7, 15000.0,
				LocalDate.parse("2002-07-20"), clienteDida, 0.67, 3, 4);
		ContaCorrente contaCorrenteRogerioCeni = new ContaCorrente("C6 Bank", 23, 9803, 4, 17000.0,
				LocalDate.parse("1992-07-04"), clienteRogerioCeni, 5, 5);
		
		arrayCP[0] = contaPoupancaCassilas;
		arrayCP[1] = contaPoupancaRogerioCeni;
		arrayCP[2] = contaPoupancaWeverton;
		arrayCP[3] = contaPoupancaBuffon;
		arrayCP[4] = contaPoupancaMarcos;
		arrayCP[5] = contaPoupancaTiagoVolpi;
		arrayCP[6] = contaPoupancaDida;
		
		arrayCC[0] = contaCorrenteBuffon;
		arrayCC[1] = contaCorrenteMarcos;
		arrayCC[2] = contaCorrenteTiagoVolpi;
		arrayCC[3] = contaCorrenteDida;
		arrayCC[4] = contaCorrenteCassio;
		arrayCC[5] = contaCorrenteCassilas;
		arrayCC[6] = contaCorrenteRogerioCeni;
		
		arrayCE[0] = contaEmpresarialDida;
		arrayCE[1] = contaEmpresarialCassio;
		arrayCE[2] = contaEmpresarialCassilas;
		arrayCE[3] = contaEmpresarialRogerioCeni;
		arrayCE[4] = contaEmpresarialWeverton; 
		arrayCE[5] = contaEmpresarialBuffon;
		
		primeiroArrayContaPoupanca(arrayCP);
		ultimoArrayContaPoupanca(arrayCP);
		tamanhoDoArrayContaPoupanca(arrayCP);
		System.out.println("---------------CONTA CORRENTE------------------------");
		
		primeiroArrayContaCorrente(arrayCC);
		ultimoArrayContaCorrente(arrayCC);
		tamanhoDoArrayContaCorrente(arrayCC);
		System.out.println("---------------CONTA EMPRESARIAL------------------------");
		primeiroArrayContaEmpresarial(arrayCE);
		ultimoArrayContaEmpresarial(arrayCE);
		tamanhoDoArrayContaEmpresarial(arrayCE);

	}
	
	public static ContaPoupanca[] arrayCP = new ContaPoupanca[7];
	public static ContaCorrente[] arrayCC = new ContaCorrente[7];
	public static ContaEmpresarial[] arrayCE = new ContaEmpresarial[6];
	
	//CONTA POUPANCA
	public static void primeiroArrayContaPoupanca(ContaPoupanca[] arrayCP){
		if (arrayCP[0] != null){
			System.out.println(arrayCP[0]);
		}
		else {
			System.out.println("Seu array está vázio");
		}
	}
	
	public static void ultimoArrayContaPoupanca(ContaPoupanca[] arrayCP){
		ContaPoupanca contaCP = null;
		if (arrayCP[0] != null){
			for (int i = 0; i < arrayCP.length; i++){
				if (arrayCP[i] != null) {
					contaCP = arrayCP[i];
				}
			}
			System.out.println("A última conta inserida foi a: ");
			System.out.println(contaCP);
		}
		else {
			System.out.println("Seu array está vazio");
		}
	}
	
	public static void tamanhoDoArrayContaPoupanca(ContaPoupanca[] arrayCP){
		int contador = 0;
		for (int i=0; i < arrayCP.length; i++){
			if (arrayCP[i] != null){
				contador ++;
			}
		}
		System.out.println("Seu array tem " + contador + " do total de " + arrayCP.length);
	}
	
	//CONTA CORRENTE
	
	public static void primeiroArrayContaCorrente(ContaCorrente[] arrayCC){
		if (arrayCC[0] != null){
			System.out.println(arrayCC[0]);
		}
		else {
			System.out.println("Seu array está vázio");
		}
	}
	
	public static void ultimoArrayContaCorrente(ContaCorrente[] arrayCC){
		ContaCorrente contaCC = null;
		if (arrayCC[0] != null){
			for (int i = 0; i < arrayCC.length; i++){
				if (arrayCC[i] != null) {
					contaCC = arrayCC[i];
				}
			}
			System.out.println("A última conta inserida foi a: ");
			System.out.println(contaCC);
		}
		else {
			System.out.println("Seu array está vazio");
		}
	}
	
	public static void tamanhoDoArrayContaCorrente(ContaCorrente[] arrayCC){
		int contador = 0;
		for (int i=0; i < arrayCC.length; i++){
			if (arrayCP[i] != null){
				contador ++;
			}
		}
		System.out.println("Seu array tem " + contador + " do total de " + arrayCC.length);
	}
	
	//CONTA EMPRESARIAL
	
	public static void primeiroArrayContaEmpresarial(ContaEmpresarial[] arrayCE){
		if (arrayCE[0] != null){
			System.out.println(arrayCE[0]);
		}
		else {
			System.out.println("Seu array está vázio");
		}
	}
	
	public static void ultimoArrayContaEmpresarial(ContaEmpresarial[] arrayCE){
		ContaEmpresarial contaCE = null;
		if (arrayCE[0] != null){
			for (int i = 0; i < arrayCE.length; i++){
				if (arrayCE[i] != null) {
					contaCE = arrayCE[i];
				}
			}
			System.out.println("A última conta inserida foi a: ");
			System.out.println(contaCE);
		}
		else {
			System.out.println("Seu array está vazio");
		}
	}
	
	public static void tamanhoDoArrayContaEmpresarial(ContaEmpresarial[] arrayCE){
		int contador = 0;
		for (int i=0; i < arrayCE.length; i++){
			if (arrayCE[i] != null){
				contador ++;
			}
		}
		System.out.println("Seu array tem " + contador + " do total de " + arrayCE.length);
	}
	
	

}
