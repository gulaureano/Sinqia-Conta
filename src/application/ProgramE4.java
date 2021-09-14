package application;

import java.time.LocalDate;

import entities.cliente.Cliente;
import entities.conta.Conta;
import entities.conta.ContaCorrente;
import entities.conta.ContaEmpresarial;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class ProgramE4 {

	public static void main(String[] args) {
		/*AQUI NESTE EXERCÍCIO É A MESMA COISA QUE O ANTERIOR, POREM ESSE "ARRAY", ESSE ESPAÇO, ACEITA QUALQUER
		 * TIPO DE CONTA, SEJA ELA CORRENTE, POUPANÇA E EMPRESARIAL, PORÉM CONTINUA COM OS MESMO PROBLEMAS
		 * APRESENTADOS ANTERIORMENTE*/
		
		
		
		Cliente clienteCassilas = new Cliente("Casillas", 1001, 778.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteBuffon = new Cliente("Buffon", 1002, 550.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteDida = new Cliente("Dida", 123456789, 780.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteRogerioCeni = new Cliente("Rogerio Ceni", 55666, 970.0, TipoCliente.FUNCIONARIO_BANCO);
		Cliente clienteMarcos = new Cliente("Marcos", 435565478, 320.0, TipoCliente.PESSOA_JURIDICA);
		Cliente clienteCassio = new Cliente("Cassio", 1003, 750.0, TipoCliente.PESSOA_FISICA);
		Cliente clienteWeverton = new Cliente("Weverton", 121213, 780.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente clienteTiagoVolpi = new Cliente("Tiago Volpi", 5649877, 780.0, TipoCliente.PESSOA_JURIDICA);

		// INSTANCIADOS TRÊS TIPOS DE CONTA E EM CADA UMA COLOCANDO UM CLIENTE
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
				LocalDate.parse("1992-07-04"), null, null, clienteRogerioCeni, "São Paulo");
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

		
		
		System.out.println(adicionaArrayConta(contaPoupancaCassilas));
		System.out.println(adicionaArrayConta(contaCorrenteBuffon));
		System.out.println(adicionaArrayConta(contaEmpresarialDida));
		System.out.println(adicionaArrayConta(contaPoupancaRogerioCeni));
		System.out.println(adicionaArrayConta(contaCorrenteMarcos));
		System.out.println(adicionaArrayConta(contaEmpresarialCassio));
		System.out.println(adicionaArrayConta(contaPoupancaWeverton));
		System.out.println(adicionaArrayConta(contaCorrenteTiagoVolpi));
		System.out.println(adicionaArrayConta(contaEmpresarialCassilas));
		System.out.println(adicionaArrayConta(contaPoupancaBuffon));
		System.out.println(adicionaArrayConta(contaCorrenteDida));
		System.out.println(adicionaArrayConta(contaEmpresarialRogerioCeni));
		System.out.println(adicionaArrayConta(contaPoupancaMarcos));
		System.out.println(adicionaArrayConta(contaCorrenteCassio));
		System.out.println(adicionaArrayConta(contaEmpresarialWeverton));
		System.out.println(adicionaArrayConta(contaPoupancaTiagoVolpi));
		System.out.println(adicionaArrayConta(contaCorrenteCassilas));
		System.out.println(adicionaArrayConta(contaEmpresarialBuffon));
		System.out.println(adicionaArrayConta(contaPoupancaDida));
		System.out.println(adicionaArrayConta(contaCorrenteRogerioCeni));
		
		System.out.println(primeiroElementoArrayConta());
		System.out.println(ultimoElementoArrayConta());
		System.out.println(tamanhoArrayConta());
	}
	
	public static Conta[] arrayConta = new Conta[20];
	
	//-----------------------------MÉTODOS DO TIPO CONTA---------------------------------------------------
	
	public static String adicionaArrayConta(Conta conta) {
		if (arrayConta[arrayConta.length - 1] == null){
			int contador = 0;
			while (arrayConta[contador] != null){
				contador++;
			}
			arrayConta[contador] = conta;
			return "Foi adicionado na posição " + contador + "\n";
		}
		return "Seu array está cheio\n";
	}
	
	public static String primeiroElementoArrayConta() {
		return "O primeiro elemento do array é:\n" + arrayConta[0];
	}
	
	public static String ultimoElementoArrayConta() {
		Conta contaTeste = null;
		if (arrayConta[0] != null) {
			for (int i=0; i < arrayConta.length; i++) {
				if (arrayConta[i] != null) {
					contaTeste = arrayConta[i];
				}
			}
			return "O último elemento adicionado foi:\n" + contaTeste;
		}
		return "Seu array está vázio";
	}
	
	public static String tamanhoArrayConta(){
			int contador = 0;
			for (int i=0; i < arrayConta.length; i++) {
				if (arrayConta[i] != null){
					contador++;
				}
			}
			
			return "Seu array tem " + contador + " posições ocupadas de um total de " + arrayConta.length;
	}

}
