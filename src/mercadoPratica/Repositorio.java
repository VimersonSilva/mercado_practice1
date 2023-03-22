package mercadoPratica;

import java.util.HashMap;
import java.util.Map;

public class Repositorio {
	private Map<Integer, Produto> produtos;
	private Map<String, Lote> lotes;
	
	Repositorio(){
		this.produtos = new HashMap<>();
	}
	
	public void addProd(int id, Produto prod) {
		this.produtos.put(id, prod);
	}

	public void addLote(String nome, Lote lote) {
		this.lotes.put(nome, lote);
	}
	public Produto obterProduto(Integer id) {
		return this.produtos.get(id);
	}
	public String consultaProduto(Integer id) {
		if(produtos.containsKey(id)) {
			return produtos.get(id).getProduto();
		}
		return "Produto não encontrado.";
	}
}
