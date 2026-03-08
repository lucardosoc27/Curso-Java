package cursojava.relacionamento.entre.classes;

public class Nome {
	
	private String nome;
	private String sobrenome;
	private String sexo;
	private String civil;
	
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public void setSobrenome (String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getSexo () {
		return this.sexo;
	}
	
	public void setSexo (String sexo) {
		this.sexo = sexo;
	}
	
	public String getCivil () {
		return this.civil;
	}
	
	public void setCivil (String civil) {
		this.civil = civil;
	}
}
