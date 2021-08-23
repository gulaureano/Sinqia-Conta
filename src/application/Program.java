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
		
		//INSTANCIADOS TRÊS EXEMPLOS DE CLIENTES
		Cliente cliente1 = new Cliente("Gustavo", 1001, 778.0, TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Geovane", 1002, 550.0, TipoCliente.PESSOA_FISICA);
		Cliente cliente3 = new Cliente("Jose Vivaldo", 123456789, 780.0, TipoCliente.PESSOA_JURIDICA);
		
		//INSTANCIADOS TRÊS TIPOS DE CONTA E EM CADA UMA COLOCANDO UM CLIENTE
		ContaPoupanca contaPoupanca = new ContaPoupanca("Itau", 89, 1001, 2, 1000.0, LocalDate.parse("2021-04-04"), cliente1, 0.5, 3, 4);
		ContaCorrente contaCorrente = new ContaCorrente("Itau", 89, 2001, 7, 2000.0, LocalDate.parse("2021-05-05"), cliente2, 5, 5);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("Nubank", 43, 3467, 7, 10000.0, LocalDate.parse("2018-07-20"), cliente3, "Coca-Cola");
		
		//TESTANDO MÉTODOS DO TIPO POUPANÇA
		contaPoupanca.saque(100.0);
		System.out.println(contaPoupanca);
		contaPoupanca.deposito(100.0);
		System.out.println(contaPoupanca);
		contaPoupanca.transferencia(contaCorrente, 100.0);
		System.out.println(contaPoupanca);
		contaPoupanca.valorizacaoMensal();
		System.out.println("__________________________________________");
		
		//TESTANDO MÉTODOS DO TIPO CORRENTE
		contaCorrente.deposito(100.0);
		System.out.println(contaCorrente);
		contaCorrente.saque(100.0);
		System.out.println(contaCorrente);
		contaCorrente.tarifaBancaria();
		System.out.println(contaCorrente);
		contaCorrente.transferenciaContaCorrente(contaEmpresarial, 100.0);
		System.out.println(contaCorrente);
		System.out.println("___________________________________________");
		
		//TESTANDO MÉTODOS DO TIPO EMPRESARIAL
		contaEmpresarial.deposito(5000.0);
		System.out.println(contaEmpresarial);
		contaEmpresarial.saque(5000.0);
		System.out.println(contaEmpresarial);
		
		
		
		
		
		
		//TESTANDO MÉTODO DO TIPO CORRENTE
		/*contaCorrente.deposito(100.0);
		System.out.println(contaCorrente);*/
		
	}

}
