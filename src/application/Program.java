package application;

import java.time.LocalDate;
import java.util.Locale;

import comparador.Comparador;
import entities.cliente.Cliente;
import entities.conta.Conta;
import entities.conta.ContaCorrente;
import entities.conta.ContaEmpresarial;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// EXERCICIO 1

		// INSTANCIADOS TRÊS EXEMPLOS DE CLIENTES
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

		/*
		 * //TESTANDO MÉTODOS DO TIPO POUPANÇA contaPoupanca.saque(100.0);
		 * System.out.println(contaPoupanca); contaPoupanca.deposito(100.0);
		 * System.out.println(contaPoupanca);
		 * contaPoupanca.transferencia(contaCorrente, 100.0);
		 * System.out.println(contaPoupanca); contaPoupanca.valorizacaoMensal();
		 * System.out.println("__________________________________________");
		 * 
		 * //TESTANDO MÉTODOS DO TIPO CORRENTE contaCorrente.deposito(100.0);
		 * System.out.println(contaCorrente); contaCorrente.saque(100.0);
		 * System.out.println(contaCorrente); contaCorrente.tarifaBancaria();
		 * System.out.println(contaCorrente);
		 * contaCorrente.transferenciaContaCorrente(contaEmpresarial, 100.0);
		 * System.out.println(contaCorrente);
		 * System.out.println("___________________________________________");
		 * 
		 * //TESTANDO MÉTODOS DO TIPO EMPRESARIAL
		 * contaEmpresarial.deposito(5000.0);
		 * System.out.println(contaEmpresarial); contaEmpresarial.saque(5000.0);
		 * System.out.println(contaEmpresarial);
		 */

		// EXERCICIO 2
		/*
		 * Comparador comparador = new Comparador(); String string1 = "Hello";
		 * String string2 = new String("Hello");
		 * 
		 * //CHAMANDO MÉTODO QUE COMPARA DOIS NÚMEROS INTEIROS COM ==
		 * System.out.println(comparador.numerosIguais(1, 1));
		 * 
		 * //CHAMANDO MÉTODO QUE COMPARA DUAS STRINGS COM ==
		 * System.out.println(comparador.stringsIguaisSemEquals(string1,
		 * string2));
		 * 
		 * //CHAMANDO MÉTODO QUE COMPARA DUAS STRINGS COM EQUALS()
		 * System.out.println(comparador.stringsIguaisComEquals(string1,
		 * string2));
		 * 
		 * //CHAMANDO MÉTODO QUE COMPARA DOIS CLIENTE COM EQUALS LEMBRANDO A
		 * REGRA DE N DE DOCUMENTO
		 * System.out.println(clientesIguaisComEquals(clienteCassilas,
		 * clienteBuffon));
		 * 
		 * //CHAMANDO MÉTODO QUE COMPARA DUAS CONTAS E VÊ SE ELAS SÃO IGUAIS COM
		 * EQUALS() LEMBRANDO A REGRA DE N DE CONTA E AGENCIA
		 * System.out.println(contasIguaisComEquals(contaPoupancaCassilas,
		 * contaCorrenteBuffon));
		 * 
		 * //O método equals() compara o conteúdo dentro dos objetos comparados,
		 * já o '==' compara o endereço de mémoria
		 */

		// EXERCICIO 3

		ContaPoupanca contaArrayTesteCP = new ContaPoupanca();
		ContaCorrente contaArrayTesteCC = new ContaCorrente();
		ContaEmpresarial contaArrayTesteCE = new ContaEmpresarial();

		// TESTANDO NO TIPO CONTA CORRENTE
		/*
		 * contaArrayTesteCC.adicionaArrayContaCorrente(contaCorrenteBuffon);
		 * contaArrayTesteCC.adicionaArrayContaCorrente(contaCorrenteMarcos);
		 * contaArrayTesteCC.adicionaArrayContaCorrente(contaCorrenteTiagoVolpi)
		 * ; contaArrayTesteCC.adicionaArrayContaCorrente(contaCorrenteDida);
		 * contaArrayTesteCC.adicionaArrayContaCorrente(contaCorrenteCassio);
		 * contaArrayTesteCC.adicionaArrayContaCorrente(contaCorrenteCassilas);
		 * contaArrayTesteCC.adicionaArrayContaCorrente(contaCorrenteRogerioCeni
		 * );
		 * 
		 * contaArrayTesteCC.getPrimeiraContaCorrenteNoArray();
		 * contaArrayTesteCC.getUltimaContaCorrenteNoArray();
		 * contaArrayTesteCC.getTamanhoArrayContaCorrente();
		 */

		// TESTANDO NO TIPO CONTA POUPANCA

		contaArrayTesteCP.adicionaArrayContaPoupança(contaPoupancaCassilas);
		contaArrayTesteCP.adicionaArrayContaPoupança(contaPoupancaRogerioCeni);
		contaArrayTesteCP.adicionaArrayContaPoupança(contaPoupancaWeverton);
		contaArrayTesteCP.adicionaArrayContaPoupança(contaPoupancaBuffon);
		contaArrayTesteCP.adicionaArrayContaPoupança(contaPoupancaMarcos);
		contaArrayTesteCP.adicionaArrayContaPoupança(contaPoupancaTiagoVolpi);
		contaArrayTesteCP.adicionaArrayContaPoupança(contaPoupancaDida);

		contaArrayTesteCP.getPrimeiraContaPoupancaNoArray();
		contaArrayTesteCP.getUltimaContaPoupancaNoArray();
		contaArrayTesteCP.getTamanhoArrayContaPoupanca();

		// TESTANDO NO TIPO CONTA EMPRESARIAL
		/*
		 * contaArrayTesteCE.adicionaArrayContaEmpresarial(contaEmpresarialDida)
		 * ; contaArrayTesteCE.adicionaArrayContaEmpresarial(
		 * contaEmpresarialCassio);
		 * contaArrayTesteCE.adicionaArrayContaEmpresarial(
		 * contaEmpresarialCassilas);
		 * contaArrayTesteCE.adicionaArrayContaEmpresarial(
		 * contaEmpresarialRogerioCeni);
		 * contaArrayTesteCE.adicionaArrayContaEmpresarial(
		 * contaEmpresarialWeverton);
		 * contaArrayTesteCE.adicionaArrayContaEmpresarial(
		 * contaEmpresarialBuffon);
		 * 
		 * contaArrayTesteCE.getPrimeiraContaEmpresarialNoArray();
		 * contaArrayTesteCE.getUltimaContaEmpresarialNoArray();
		 * contaArrayTesteCE.getTamanhoArrayContaEmpresarial();
		 */

		// EXERCÍCIO 4
		/*
		 * ArrayDeConta contas = new ArrayDeConta();
		 * contas.adicionaNoArray(contaPoupancaCassilas);
		 * contas.adicionaNoArray(contaCorrenteBuffon);
		 * contas.adicionaNoArray(contaEmpresarialDida);
		 * contas.adicionaNoArray(contaPoupancaRogerioCeni);
		 * contas.adicionaNoArray(contaCorrenteMarcos);
		 * contas.adicionaNoArray(contaEmpresarialCassio);
		 * contas.adicionaNoArray(contaPoupancaWeverton);
		 * contas.adicionaNoArray(contaCorrenteTiagoVolpi);
		 * contas.adicionaNoArray(contaEmpresarialCassilas);
		 * contas.adicionaNoArray(contaPoupancaBuffon);
		 * contas.adicionaNoArray(contaCorrenteDida);
		 * contas.adicionaNoArray(contaEmpresarialRogerioCeni);
		 * contas.adicionaNoArray(contaPoupancaMarcos);
		 * contas.adicionaNoArray(contaCorrenteCassio);
		 * contas.adicionaNoArray(contaEmpresarialWeverton);
		 * contas.adicionaNoArray(contaPoupancaTiagoVolpi);
		 * contas.adicionaNoArray(contaCorrenteCassilas);
		 * contas.adicionaNoArray(contaEmpresarialBuffon);
		 * contas.adicionaNoArray(contaPoupancaDida);
		 * contas.adicionaNoArray(contaCorrenteRogerioCeni);
		 * 
		 * contas.getPrimeiroElemento(); contas.getUltimoElemento();
		 * contas.getTamanhoArray();
		 */

	}

	// MÉTODOS DO EXERCICIO 2
	public static String clientesIguaisComEquals(Cliente cliente1, Cliente cliente2) {
		if (cliente1.getNumeroDocumentoCliente().equals(cliente2.getNumeroDocumentoCliente())) {
			return "Clientes com nº documentos iguais";
		} else {
			return "Clientes com nº documentos diferentes";
		}
	}

	public static String contasIguaisComEquals(Conta conta1, Conta conta2) {
		if (conta1.getNumeroAgencia().equals(conta2.getNumeroAgencia())
				&& conta1.getNumeroConta().equals(conta2.getNumeroConta())) {
			return "Contas iguais";
		} else {
			return "Contas diferentes";
		}
	}

	// MÉTODOS DO EXERCICIO 3

}



