package application;

import java.time.LocalDate;
import java.util.Locale;

import entities.cliente.Cliente;
import entities.conta.ContaCorrente;
import entities.conta.ContaEmpresarial;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// EXERCICIO 1
		
//		//INSTANCIANDO CLIENTES, NA CRIA??O DOS CLIENTES, TODOS PRECISAM TER NOME, N DE DOCUMENTO, SCORE E SEU TIPO
//		SE ? PESSOA FISICA, PESSOA JURIDICA, SERVIDOR P?BLICO OU FUNCION?RIO DO BANCO
		
		Cliente cliente1 = new Cliente("Gustavo", 1001, 780.0, TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Geovane", 1002, 894.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente cliente3 = new Cliente("Jos?", 1003, 1000.0, TipoCliente.FUNCIONARIO_BANCO);
		
//		//INSTANCIANDO CONTAS, ASSIM COMO CLIENTES, PARA A CRIA??O DE CONTAS, TEM QUE TER INFORMA??ES BASICAS PARA CRIA-LAS
//		COMO O NOME DO BANCO, AGENCIA, CONTA, DATA DA CRIACAO, SALDO INICIAL ETC. SALVO ALGUMAS PARTICULARIDADES DE ALGUMAS CONTAS, COMO 
//		NO CASO DE  CONTA POUPAN?A QUE TEM MESES DE CARENCIA, CONTA CORRENTE TEM PORCENTAGEM DA TARIFA E A EMPRESARIAL QUE TEMOS QUE PASSAR O NOME DA EMPRESA
		ContaPoupanca contaPoupanca = new ContaPoupanca("Itau", "45", "9090", "9", 1000.0, LocalDate.now(), null, null, cliente2, 0.25, 2, 5);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", "37", "8080", "7", 1000.0, LocalDate.parse("2018-10-07"), null, null, cliente1, 4, 4);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("C6 Bank", "94", "5050", "5", 10000.0, LocalDate.parse("1973-04-10"), null, null, cliente3, "Apsen Farmaceutica");
		
		//USANDO M?TODOS DA CLASSE CONTA POUPAN?A, AQUI TEMOS COMO SE FOSSE O CORRENTISTA DA CONTA UTILIZANDO A CONTA PARA REALIZAR AS OPERA??ES QUE ELE PODE FAZER NELA
		System.out.println("------------------------CONTA POUPAN?A--------------------------");
		System.out.println(contaPoupanca);
		contaPoupanca.deposito(100.0);
		System.out.println(contaPoupanca);
		contaPoupanca.saque(100.0);
		System.out.println(contaPoupanca);
		contaPoupanca.valorizacaoMensal();
		System.out.println(contaPoupanca);
		
		//USANDO M?TODOS DA CLASSE CONTA CORRENTE, AQUI A MESMA COISA QUE DE CIMA, MAS PARA CORRENTISTA DA CONTA CORRENTE
		System.out.println("------------------------CONTA CORRENTE--------------------------");
		System.out.println(contaCorrente);
		contaCorrente.deposito(100.0);
		System.out.println(contaCorrente);
		contaCorrente.saque(100.0);
		contaCorrente.saque(100.0);
		contaCorrente.saque(100.0);
		contaCorrente.saque(100.0);
		contaCorrente.saque(100.0);
		System.out.println(contaCorrente);
		contaCorrente.tarifaBancaria();
		System.out.println(contaCorrente);
		
		//USANDO M?TODOS DA CLASSE CONTA EMPRESARIAL, MESMA COISA, MAS PARA AS OPERA??ES DA CONTA EMPRESARIAL
		System.out.println("------------------------CONTA EMPRESARIAL--------------------------");
		contaEmpresarial.deposito(5000.0);
		System.out.println(contaEmpresarial);
		contaEmpresarial.saque(5000.0);
		System.out.println(contaEmpresarial);
		contaEmpresarial.transferencia(contaCorrente, 100.0);
		System.out.println(contaEmpresarial);
		System.out.println(contaCorrente);
		
		
	}

}



