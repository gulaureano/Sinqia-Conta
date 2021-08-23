package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import entities.cliente.Cliente;
import entities.conta.ContaCorrente;
import entities.conta.ContaEmpresarial;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d1 = sdf.parse("05/06/2021");
		
		//INSTANCIADOS TR�S EXEMPLOS DE CLIENTES
		Cliente cliente1 = new Cliente("Gustavo", 1001, 778.0, TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Geovane", 1002, 550.0, TipoCliente.PESSOA_FISICA);
		Cliente cliente3 = new Cliente("Coca-Cola", 123456789, 780.0, TipoCliente.PESSOA_JURIDICA);
		
		//INSTANCIADOS TR�S TIPOS DE CONTA E EM CADA UMA COLOCANDO UM CLIENTE
		ContaPoupanca contaPoupan�a = new ContaPoupanca("Itau", 40, 1001, 85, 1000.0, d1, cliente1);
		ContaCorrente contaCorrente = new ContaCorrente("Bradesco", 67, 1002, 94, 1000.0, new Date(), cliente2);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("NuBank", 38, 1003, 77, 150000.0, new Date(), cliente3);
		
		//TESTANDO M�TODOS DO TIPO POUPAN�A
		contaPoupan�a.saque(100.0);
		System.out.println(contaPoupan�a);
		contaPoupan�a.deposito(100.0);
		System.out.println(contaPoupan�a);
		contaPoupan�a.transferencia(contaCorrente, 100.0);
		System.out.println(contaPoupan�a);
		System.out.println(contaCorrente);
		System.out.println();
		contaPoupan�a.valorizacaoMensal();
		
		
		//TESTANDO M�TODO DO TIPO CORRENTE
		/*contaCorrente.deposito(100.0);
		System.out.println(contaCorrente);*/
		
	}

}
