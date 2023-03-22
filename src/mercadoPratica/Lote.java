package mercadoPratica;


import java.util.Date;
import java.util.Objects;

public class Lote {
	private Produto prod;
	private int quant;
	private String validade;
	
	Lote(Produto prod, int quantidade, String validade){
		this.prod = prod;
		this.validade = validade;
		this.quant = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(prod, validade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lote other = (Lote) obj;
		return Objects.equals(prod, other.prod) && validade == other.validade;
	}
	
	
}
