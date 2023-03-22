package mercadoPratica;


public class Service {
	private Repositorio repo;
	
	Service(){
		this.repo = new Repositorio();
	}

	public void criaProduto(String nome, String fabricante, double preco) {
		Produto prod = new Produto(nome, fabricante, preco);
		int id = prod.hashCode();
		this.repo.addProd(id, prod);
	}
	
	public void criaLote(String nome, int quant, String data, Integer idProd) {
		Produto prod = repo.obterProduto(idProd);
		Lote lote = new Lote(prod, quant, data);
		this.repo.addLote(nome, lote);
	}
	
	public String consultaProduto(int idProduto) {
		return this.repo.consultaProduto(idProduto);
	}
	
}
