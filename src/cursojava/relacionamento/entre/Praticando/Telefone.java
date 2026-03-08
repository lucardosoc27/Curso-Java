package cursojava.relacionamento.entre.Praticando;

public class Telefone {
	
	private String tipo;
	private String ddd;
	private String numero;
	
	public String getTipo () {
		return this.tipo;
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}

	public String getDdd () {
		return this.ddd;
	}
	
	public void setDdd (String ddd) {
		this.ddd = ddd;
	}
	
	public String getNumero () {
		return this.numero;
	}
	
	public void setNumero (String numero) {
		this.numero = numero;
	}
	
	public String toString () {
		return  "Tipo: " + tipo + "\n" +
				"DDD: " + ddd + "\n" +
				"Numero: " + numero + "\n";
	}

}
