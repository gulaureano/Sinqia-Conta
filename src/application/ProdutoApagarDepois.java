package application;

public class ProdutoApagarDepois {
	public String nome;
	public Double valor;
	public Integer quantidade;
	
	public ProdutoApagarDepois(String nome, Double valor, Integer quantidade){
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public Double total(){
		return valor * quantidade;
	}

	@Override
	public String toString() {
		return "ProdutoApagarDepois [nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}
	
	
}
