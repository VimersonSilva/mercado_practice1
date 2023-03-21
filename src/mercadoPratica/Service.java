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
	
	public void criaLote(String nome, Date data, int quant) {
		Produto prod = new Produto(nome, , preco);
		int id = prod.hashCode();
		this.repo.addProd(id, prod);
	}
	
}
