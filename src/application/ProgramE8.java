package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.cliente.Cliente;
import entities.conta.Conta;
import entities.conta.ContaCorrente;
import entities.conta.ContaPoupanca;
import entities.enums.TipoCliente;

public class ProgramE8 {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Gustavo", 1001, 780.0, TipoCliente.PESSOA_FISICA);
		Cliente cliente2 = new Cliente("Geovane", 1002, 894.0, TipoCliente.SERVIDOR_PUBLICO);
		
		
		ContaPoupanca contaAtiva = new ContaPoupanca("Itau", "45", "9090", "9", 1000.0, LocalDate.now(), null, null, cliente2, 0.25, 2, 5);
		ContaCorrente contaInativa = new ContaCorrente("NuBank", "37", "8080", "7", 1000.0, LocalDate.parse("2018-10-07"), LocalDate.parse("2020-05-20"), "Não desejo mais ter conta neste banco", cliente1, 4, 4);
		

		System.out.println(StringActiveAccount(contaAtiva));
		System.out.println(StringActiveAccount(contaInativa));
	}
	
	public static String StringActiveAccount(Conta conta){
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
		String answer = null;
		
			answer = "A/O "
					+ conta.getCliente().getTipoCliente()
					+ " de nome "
					+ conta.getCliente().getNomeCliente()
					+ ", possuidor do documento "
					+ conta.getCliente().getNumeroDocumentoCliente()
					+ ", possui uma conta "
					+ typeAccount(conta)
					+ " nesta instituição financeira, reconhecida pelo código "
					+ conta.getCodigoIdentificadorBanco()
					+ ", com o valor de R$ "
					+ String.format("%.2f", conta.getSaldo())
					+ " em conta em dia "
					+ dtf.format(LocalDate.now())
					+ " A "
					+ typeAccount(conta)
					+ ", da agência "
					+ conta.getNumeroAgencia()
					+ ", e da conta "
					+ conta.getNumeroConta()
					+ ", foi aberta pelo "
					+ conta.getCliente().getNomeCliente()
					+ " na data de "
					+ dtf.format(conta.getDataAbertura())
					+ ", em uma unidade presencial ou por meio de acesso digital desta instituição.";
			
			if(conta.getDataFechamento() != null){
				answer += "O cliente"
						+ conta.getCliente().getNomeCliente()
						+ " encerrou sua "
						+ typeAccount(conta)
						+ " nesta instituição na data de "
						+ dtf.format(conta.getDataFechamento())
						+ ", pelo seguinte motivo: "
						+ conta.getMotivoFechamento();
			}
		return answer;
	}
	
	public static String StringBuilderActiveAccount(Conta conta){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");
		
		StringBuilder sb = new StringBuilder();
		sb.append("A/O ");
		sb.append(conta.getCliente().getTipoCliente());
		sb.append(" de nome ");
		sb.append(conta.getCliente().getNomeCliente());
		sb.append(", possuidor do documento ");
		sb.append(conta.getCliente().getNumeroDocumentoCliente());
		sb.append(", possui uma conta ");
		sb.append(typeAccount(conta));
		sb.append(" nesta instituição financeira, reconhecida pelo código ");
		sb.append(conta.getCodigoIdentificadorBanco());
		sb.append(", com o valor de R$ ");
		sb.append(String.format("%.2f", conta.getSaldo()));
		sb.append(dtf.format(LocalDate.now()));
		sb.append(" A ");
		sb.append(typeAccount(conta));
		sb.append(", da agência ");
		sb.append(conta.getNumeroAgencia());
		sb.append(", e da conta ");
		sb.append(conta.getNumeroConta());
		sb.append(", foi aberta pelo ");
		sb.append(conta.getCliente().getNomeCliente());
		sb.append(" na data de ");
		sb.append(dtf.format(conta.getDataAbertura()));
		sb.append(", em uma unidade presencial ou por meio de acesso digital desta instituição.");
		
		if (conta.getDataFechamento() != null){
			sb.append("O cliente ");
			sb.append(conta.getCliente().getNomeCliente());
			sb.append(" encerrou sua ");
			sb.append(typeAccount(conta));
			sb.append(" nesta instituição na data de ");
			sb.append(dtf.format(conta.getDataFechamento()));
			sb.append(", pelo seguinte motivo: ");
			sb.append(conta.getMotivoFechamento());
		}
		return sb.toString();	
	}
	
	public static String typeAccount(Conta conta){
		if (conta instanceof ContaPoupanca){
			return "poupança";
		}
		else if (conta instanceof ContaCorrente){
			return "corrente";
		}
		else {
			return "empresarial";
		}
	}
}
