package cursojava.relacionamento.entre.classes;

public class Contato {
	
	private Nome nomes;
	private Endereco [] enderecos;
	private Telefone [] telefones;
	
	public Nome getNomes() {
		return this.nomes;
	}
	
	public void setNomes(Nome nomes) {
		this.nomes = nomes;
	}
	
	public Endereco [] getEnderecos () {
		return this.enderecos;
	}
	
	public void setEnderecos (Endereco [] enderecos) {
		this.enderecos = enderecos;
	}
	
	public Telefone [] getTelefones() {
		return this.telefones;
	}
	
	public void setTelefones (Telefone [] telefones) {
		this.telefones = telefones;
	}
}
