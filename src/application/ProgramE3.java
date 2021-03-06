package application;

import java.time.LocalDate;

import entities.cliente.Cliente;
import entities.conta.ContaCorrente;
import entities.conta.ContaEmpresarial;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class ProgramE3 {

	public static void main(String[] args) {
		/*NESTE EXERCICIO TERIAMOS QUE CRIAR 20 CONTAS VARIADAS E GUARDAR ELAS EM UM "ARRAY" DE CADA
		 * TIPO DE CONTA, QUE ? COMO SE FOSSE VOCE SEPARAR UMA CERTA QUANTIDADE DE ESPA?O DE MEMORIA PARA COLOCAR
		 * CERTO TIPO DE COISA, NO CASO DESTE EXERCICIO, FOI SEPARAR 20 ESPA?OS DE MEMORIA PARA COLOCAR VINTE
		 * CONTAS, ALEM DISSO, TERIAMOS QUE FAZER OPERA?OES PARA PEGAR O PRIMEIRO ELEMENTO INSERIDO NESTE ESPA?O,
		 * O ULTIMO E QUANTOS ELEMENTOS TEM INSERIDO NO TOTAL, APRENDI QUE NESSA FORMA, O TAMANHO ? FIXO, 
		 * OU SEJA, EU S? POSSO COLOCAR APENAS 20 CONTAS, CASO SURJA A 21 CONTA N?O PODERIA COLOCAR, ESSE 
		 * METODO TAMBEM ? MAIS LENTO, SE EU QUISER VER A ULTIMA CONTA, TENHO QUE IR UM POR UM, AT? A ULTIMA
		 * CONTA*/
		
		
		
		Cliente clienteCassilas = new Cliente("Casillas", 1001, 778.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteBuffon = new Cliente("Buffon", 1002, 550.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteDida = new Cliente("Dida", 123456789, 780.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteRogerioCeni = new Cliente("Rogerio Ceni", 55666, 970.0, TipoCliente.FUNCIONARIO_BANCO);
		Cliente clienteMarcos = new Cliente("Marcos", 435565478, 320.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteCassio = new Cliente("Cassio", 1003, 750.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteWeverton = new Cliente("Weverton", 121213, 780.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente clienteTiagoVolpi = new Cliente("Tiago Volpi", 5649877, 780.0, TipoCliente.PESSOA_JURIDICA);

		// INSTANCIADOS TR?S TIPOS DE CONTA E EM CADA UMA COLOCANDO UM CLIENTE
		ContaPoupanca contaPoupancaCassilas = new ContaPoupanca("Itau", "45", "1010", "7", 1000.0, LocalDate.parse("2003-09-06"), null, null, clienteCassilas, 0.25, 3, 5);
		ContaCorrente contaCorrenteBuffon = new ContaCorrente("Itau", "89", "1001", "2", 2000.0,
				LocalDate.parse("1997-10-05"), null, null, clienteBuffon, 5, 5);
		ContaEmpresarial contaEmpresarialDida = new ContaEmpresarial("Nubank", "43", "3467", "7", 10000.0,
				LocalDate.parse("2002-07-20"), null, null, clienteDida, "Milan");
		ContaPoupanca contaPoupancaRogerioCeni = new ContaPoupanca("Bradesco", "67", "2001", "2", 1500.0,
				LocalDate.parse("1992-07-04"), null, null, clienteRogerioCeni, 0.5, 3, 4);
		ContaCorrente contaCorrenteMarcos = new ContaCorrente("Nubank", "43", "3468", "7", 2000.0,
				LocalDate.parse("1999-06-05"), null, null, clienteMarcos, 5, 5);
		ContaEmpresarial contaEmpresarialCassio = new ContaEmpresarial("C6 Bank", "23", "9800", "9", 50000.0,
				LocalDate.parse("2012-07-13"), null, null, clienteCassio, "Corinthians");
		ContaPoupanca contaPoupancaWeverton = new ContaPoupanca("Neon", "81", "4000", "1", 3000.0,
				LocalDate.parse("2020-04-04"), null, null, clienteWeverton, 0.6, 3, 4);
		ContaCorrente contaCorrenteTiagoVolpi = new ContaCorrente("Neon", "81", "4001", "1", 2500.0,
				LocalDate.parse("2017-05-05"), null, null, clienteTiagoVolpi, 5, 5);
		ContaEmpresarial contaEmpresarialCassilas = new ContaEmpresarial("Itau", "89", "1003", "6", 70000.0,
				LocalDate.parse("2003-04-04"), null, null, clienteCassilas, "Real Madrid");
		ContaPoupanca contaPoupancaBuffon = new ContaPoupanca("C6 Bank", "23", "9801", "9", 3560.0,
				LocalDate.parse("1997-10-05"), null, null, clienteBuffon, 0.45, 3, 4);
		ContaCorrente contaCorrenteDida = new ContaCorrente("Neon", "81", "4002", "5", 4789.0, LocalDate.parse("2002-07-20"),
				null, null, clienteDida, 5, 5);
		ContaEmpresarial contaEmpresarialRogerioCeni = new ContaEmpresarial("Bradesco", "67", "2002", "6", 70000.0,
				LocalDate.parse("1992-07-04"), null, null, clienteRogerioCeni, "S?o Paulo");
		ContaPoupanca contaPoupancaMarcos = new ContaPoupanca("Bradesco", "67", "2003", "9", 5000.0,
				LocalDate.parse("1999-06-05"), null, null, clienteMarcos, 0.35, 3, 4);
		ContaCorrente contaCorrenteCassio = new ContaCorrente("C6 Bank", "23", "9802", "4", 3789.0,
				LocalDate.parse("2012-07-13"), null, null, clienteCassio, 5, 5);
		ContaEmpresarial contaEmpresarialWeverton = new ContaEmpresarial("Nubank", "43", "3469", "6", 90000.0,
				LocalDate.parse("2020-04-04"), null, null, clienteWeverton, "Palmeiras");
		ContaPoupanca contaPoupancaTiagoVolpi = new ContaPoupanca("Bradesco", "67", "2004", "9", 9000.0,
				LocalDate.parse("2017-05-05"), null, null, clienteTiagoVolpi, 0.25, 3, 4);
		ContaCorrente contaCorrenteCassilas = new ContaCorrente("Itau", "89", "1004", "4", 6000.0,
				LocalDate.parse("2003-04-04"), null, null, clienteCassilas, 5, 5);
		ContaEmpresarial contaEmpresarialBuffon = new ContaEmpresarial("Neon", "81", "4003", "2", 200000.0,
				LocalDate.parse("1997-10-05"), null, null, clienteBuffon, "Juventus");
		ContaPoupanca contaPoupancaDida = new ContaPoupanca("Bradesco", "67", "2005", "7", 15000.0,
				LocalDate.parse("2002-07-20"), null, null, clienteDida, 0.67, 3, 4);
		ContaCorrente contaCorrenteRogerioCeni = new ContaCorrente("C6 Bank", "23", "9803", "4", 17000.0,
				LocalDate.parse("1992-07-04"), null, null, clienteRogerioCeni, 5, 5);
		
		
		
		System.out.println("---------------CONTA POUPAN?A------------------------");
		adicionarArrayContaPoupanca(contaPoupancaCassilas);
		adicionarArrayContaPoupanca(contaPoupancaRogerioCeni);
		adicionarArrayContaPoupanca(contaPoupancaWeverton);
		adicionarArrayContaPoupanca(contaPoupancaBuffon);
		adicionarArrayContaPoupanca(contaPoupancaMarcos);
		adicionarArrayContaPoupanca(contaPoupancaDida);
		adicionarArrayContaPoupanca(contaPoupancaTiagoVolpi);
		adicionarArrayContaPoupanca(contaPoupancaDida);
		primeiroArrayContaPoupanca();
		ultimoArrayContaPoupanca();
		tamanhoDoArrayContaPoupanca();
		
		System.out.println("---------------CONTA CORRENTE------------------------");
		adicionarArrayContaCorrente(contaCorrenteBuffon);
		adicionarArrayContaCorrente(contaCorrenteMarcos);
		adicionarArrayContaCorrente(contaCorrenteTiagoVolpi);
		adicionarArrayContaCorrente(contaCorrenteDida);
		adicionarArrayContaCorrente(contaCorrenteCassio);
		adicionarArrayContaCorrente(contaCorrenteCassilas);
		adicionarArrayContaCorrente(contaCorrenteRogerioCeni);
		adicionarArrayContaCorrente(contaCorrenteRogerioCeni);
		primeiroArrayContaCorrente();
		ultimoArrayContaCorrente();
		tamanhoDoArrayContaCorrente();
		
		System.out.println("---------------CONTA EMPRESARIAL------------------------");
		adicionarArrayContaEmpresarial(contaEmpresarialDida);
		adicionarArrayContaEmpresarial(contaEmpresarialCassio);
		adicionarArrayContaEmpresarial(contaEmpresarialCassilas);
		adicionarArrayContaEmpresarial(contaEmpresarialRogerioCeni);
		adicionarArrayContaEmpresarial(contaEmpresarialWeverton);
		adicionarArrayContaEmpresarial(contaEmpresarialBuffon);
		adicionarArrayContaEmpresarial(contaEmpresarialDida);
		primeiroArrayContaEmpresarial();
		ultimoArrayContaEmpresarial();
		tamanhoDoArrayContaEmpresarial();
	}
	
	public static ContaPoupanca[] arrayCP = new ContaPoupanca[7];
	public static ContaCorrente[] arrayCC = new ContaCorrente[7];
	public static ContaEmpresarial[] arrayCE = new ContaEmpresarial[6];
	
	
	
	//---------------------------M?TODOS DA CONTA POUPANCA--------------------------------------------
	public static void adicionarArrayContaPoupanca(ContaPoupanca conta) {
		if (arrayCP[arrayCP.length - 1] == null){
			int contador = 0;
			while (arrayCP[contador] != null){
				contador++;
			}
			arrayCP[contador] = conta;
			System.out.println("Foi adicionado na posi??o: " + contador);
		}
		else {
			System.out.println("Seu array est? cheio");
		}
	}
	
	public static void primeiroArrayContaPoupanca(){
		if (arrayCP[0] != null){
			System.out.println(arrayCP[0]);
		}
		else {
			System.out.println("Seu array est? v?zio");
		}
	}
	
	public static void ultimoArrayContaPoupanca(){
		ContaPoupanca contaCP = null;
		if (arrayCP[0] != null){
			for (int i = 0; i < arrayCP.length; i++){
				if (arrayCP[i] != null) {
					contaCP = arrayCP[i];
				}
			}
			System.out.println("A ?ltima conta inserida foi a: ");
			System.out.println(contaCP);
		}
		else {
			System.out.println("Seu array est? vazio");
		}
	}
	
	public static void tamanhoDoArrayContaPoupanca(){
		int contador = 0;
		for (int i=0; i < arrayCP.length; i++){
			if (arrayCP[i] != null){
				contador ++;
			}
		}
		System.out.println("Seu array tem " + contador + " do total de " + arrayCP.length);
	}
	
	//-----------------------------------M?TODOS DA CONTA CORRENTE-------------------------------------------
	
	public static void adicionarArrayContaCorrente(ContaCorrente conta) {
		if (arrayCC[arrayCC.length - 1] == null){
			int contador = 0;
			while (arrayCC[contador] != null){
				contador++;
			}
			arrayCC[contador] = conta;
			System.out.println("Foi adicionado na posi??o: " + contador);
		}
		else {
			System.out.println("Seu array est? cheio");
		}
	}
	
	public static void primeiroArrayContaCorrente(){
		if (arrayCC[0] != null){
			System.out.println(arrayCC[0]);
		}
		else {
			System.out.println("Seu array est? v?zio");
		}
	}
	
	public static void ultimoArrayContaCorrente(){
		ContaCorrente contaCC = null;
		if (arrayCC[0] != null){
			for (int i = 0; i < arrayCC.length; i++){
				if (arrayCC[i] != null) {
					contaCC = arrayCC[i];
				}
			}
			System.out.println("A ?ltima conta inserida foi a: ");
			System.out.println(contaCC);
		}
		else {
			System.out.println("Seu array est? vazio");
		}
	}
	
	public static void tamanhoDoArrayContaCorrente(){
		int contador = 0;
		for (int i=0; i < arrayCC.length; i++){
			if (arrayCC[i] != null){
				contador ++;
			}
		}
		System.out.println("Seu array tem " + contador + " do total de " + arrayCC.length);
	}
	
	//------------------------------------M?TODOS DA CONTA EMPRESARIAL-----------------------------------
	
	public static void adicionarArrayContaEmpresarial(ContaEmpresarial conta) {
		if (arrayCE[arrayCE.length - 1] == null){
			int contador = 0;
			while (arrayCE[contador] != null){
				contador++;
			}
			arrayCE[contador] = conta;
			System.out.println("Foi adicionado na posi??o: " + contador);
		}
		else {
			System.out.println("Seu array est? cheio");
		}
	}
	
	public static void primeiroArrayContaEmpresarial(){
		if (arrayCE[0] != null){
			System.out.println(arrayCE[0]);
		}
		else {
			System.out.println("Seu array est? v?zio");
		}
	}
	
	public static void ultimoArrayContaEmpresarial(){
		ContaEmpresarial contaCE = null;
		if (arrayCE[0] != null){
			for (int i = 0; i < arrayCE.length; i++){
				if (arrayCE[i] != null) {
					contaCE = arrayCE[i];
				}
			}
			System.out.println("A ?ltima conta inserida foi a: ");
			System.out.println(contaCE);
		}
		else {
			System.out.println("Seu array est? vazio");
		}
	}
	
	public static void tamanhoDoArrayContaEmpresarial(){
		int contador = 0;
		for (int i=0; i < arrayCE.length; i++){
			if (arrayCE[i] != null){
				contador ++;
			}
		}
		System.out.println("Seu array tem " + contador + " do total de " + arrayCE.length);
	}
	
	

}
