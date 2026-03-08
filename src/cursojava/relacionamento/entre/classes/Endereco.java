package cursojava.relacionamento.entre.classes;

public class Endereco {
	
	private String nomeRua;
	private String numero;
	private String Complemento;
	private String Cidade;
	private String estado;
	private String cep;
	
	public String getNomeRua () {
		return this.nomeRua;
	}
	
	public void setNomeRua (String nomeRua) {
		this.nomeRua = nomeRua;
	}
	
	public String getNumero () {
		return this.numero;
	}
	
	public void setNumero (String numero) {
		this.numero = numero;
	}
	
	public String getComplemento () {
		return this.Complemento;
	}
	
	public void setComplemento (String complemento) {
		this.Complemento = complemento;
	}
	
	public String getCidade () {
		return this.Cidade;
	}
	
	public void setCidade (String cidade) {
		this.Cidade = cidade;
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
	
	
}
