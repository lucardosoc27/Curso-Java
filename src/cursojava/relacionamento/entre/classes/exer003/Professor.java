package cursojava.relacionamento.entre.classes.exer003;

public class Professor {

	private String nome;
	private String departamento;
	private String email;
	
	public Professor (String nome, String departamento, String email) {
		
		this.nome = nome;
		this.departamento = departamento;
		this.email = email;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getDepartamento () {
		return this.departamento;
	}
	
	public void setDepartamento (String departamento) {
		this.departamento = departamento;
	}
	
	public String getEmail () {
		return this.email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String toString () {
		return "\n====== Professor ======\n\n" +
				"Nome: " + nome + "\n" + 
				 "Departamento: " + departamento + "\n" +
				  "Email: " + email + "\n";
	}
}