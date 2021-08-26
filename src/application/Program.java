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
		
		//INSTANCIANDO CLIENTES
		Cliente cliente1 = new Cliente("Gustavo", 1001, 780.0, TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Geovane", 1002, 894.0, TipoCliente.SERVIDOR_PUBLICO);
		Cliente cliente3 = new Cliente("José", 1003, 1000.0, TipoCliente.FUNCIONARIO_BANCO);
		
		//INSTANCIANDO CONTAS
		ContaPoupanca contaPoupanca = new ContaPoupanca("Itau", 45, 9090, 9, 1000.0, LocalDate.now(), cliente2, 0.25, 2, 5);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", 37, 8080, 7, 1000.0, LocalDate.parse("2018-10-07"), cliente1, 4, 4);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("C6 Bank", 94, 5050, 5, 10000.0, LocalDate.parse("1973-04-10"), cliente3, "Apsen Farmaceutica");
		
		//USANDO MÉTODOS DA CLASSE CONTA POUPANCA
//		System.out.println(contaPoupanca);
//		contaPoupanca.deposito(100.0);
//		System.out.println(contaPoupanca);
//		contaPoupanca.saque(100.0);
//		System.out.println(contaPoupanca);
//		contaPoupanca.valorizacaoMensal();
//		System.out.println(contaPoupanca);
		
		//USANDO MÉTODOS DA CLASSE CONTA CORRENTE
//		System.out.println(contaCorrente);
//		contaCorrente.deposito(100.0);
//		System.out.println(contaCorrente);
//		contaCorrente.saque(100.0);
//		contaCorrente.saque(100.0);
//		contaCorrente.saque(100.0);
//		contaCorrente.saque(100.0);
//		contaCorrente.saque(100.0);
//		System.out.println(contaCorrente);
//		contaCorrente.tarifaBancaria();
//		System.out.println(contaCorrente);
		
		//USANDO MÉTODOS DA CLASSE CONTA EMPRESARIAL
		contaEmpresarial.deposito(5000.0);
		System.out.println(contaEmpresarial);
		contaEmpresarial.saque(5000.0);
		System.out.println(contaEmpresarial);
		contaEmpresarial.transferencia(contaCorrente, 100.0);
		System.out.println(contaEmpresarial);
		System.out.println(contaCorrente);
		
		
	}

}



