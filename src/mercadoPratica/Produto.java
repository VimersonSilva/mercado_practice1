package mercadoPratica;

import java.util.Objects;

public class Produto {
	private String nome;
	private String fabricante;
	private double preco;
	
	public Produto(String nome, String fabricante,
			double preco) {
		this.nome = nome;
		this.fabricante = fabricante;
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
	
	public String getProduto() {
		return "produto: " + nome + "/nfabricante: " + fabricante + "/npreco do produto: " + preco; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}
