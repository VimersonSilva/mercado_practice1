package mercadoPratica;

public class Fachada {
	Service service_mercado;
	
	Fachada(){
		this.service_mercado = new Service();
	}
	
	void criaProduto(String nome, String fabricante, double preco){
		service_mercado.criaProduto(nome, fabricante, preco);
	}
}
