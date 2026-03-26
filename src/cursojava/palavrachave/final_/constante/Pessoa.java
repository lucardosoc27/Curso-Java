package cursojava.palavrachave.final_.constante;
/**
 * Conceito de abstract: Você apenas define, você não pode tornar realidade a classe ou o metodo. E no caso dos metodos abstratos, as classes filhas
 * precisam declarar esses metodos
 */

public final class Pessoa {   /* A palavra chave 'final' não permite que a gente extenda a classe*/
	
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;
	
	/* O modificador 'protected' é semelhante a default, só que a diferença entre os dois é: 
	 não importa em qual pacote as subclasses estejam, elas vão acesso a esse atributo ou a esse metodo*/
	protected String nomeVisibilidade;  
	
	
	
	public Pessoa() {}
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefoneCelular () {
		return this.telefoneCelular;
	}
	
	public void setTelefoneCelular (String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	//public abstract String obterEtiquetaEndereco ();
	
	//public abstract void imprimirEtiquetaEndereco ();
	
}