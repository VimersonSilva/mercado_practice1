package mercadoPratica;

public class Client {
	
	public static void main(String[] args) {
		Fachada fachada = new Fachada();
		fachada.criaProduto("Leite", "Parmalat", 2.99);
	}
	
}
