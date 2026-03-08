package cursojava.relacionamento.entre.Praticando;

public class Endereco {
	
	private String nomeRua;
	private String complemento;
	private String cidade;
	private String estado;
	private String cep;
	private String numero;
	
	public String getNomeRua () {
		return this.nomeRua;
	}
	
	public void setNomeRua (String nomeRua) {
		this.nomeRua = nomeRua;
	}
	
	public String getComplemento () {
		return this.complemento;
	}
	
	public void setComplemento (String complemento) {
		this.complemento = complemento;
	}
	
	public String getCidade () {
		return this.cidade;
	}
	
	public void setCidade (String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado () {
		return this.estado;
	}
	
	public void setEstado (String estado) {
		this.estado = estado;
	}
	
	public String getCep () {
		return this.cep;
	}
	
	public void setCep (String cep) {
		this.cep = cep;
	}
	
	public String getNumero () {
		return this.numero;
	}
	
	public void setNumero (String numero) {
		this.numero = numero;
	}
	
	public String toString () {
		return "Ficha do endereço: \n\n" +
				"Nome da rua: " + nomeRua + "\n" + 
				"Complemento: " + complemento + "\n" + 
				"Cidade: " + cidade + "\n" + 
				"Estado: " + estado + "\n" + 
				"Cep: " + cep + "\n" + 
				"Numero da rua: " + numero + "\n";
	}

}
