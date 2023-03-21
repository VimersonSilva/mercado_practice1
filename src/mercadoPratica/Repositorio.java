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
}
