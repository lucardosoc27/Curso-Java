package cursojava.herança2;

public class Aluno extends Pessoa {
	
	//Herança no java, é um tipo de relacionamento: é um ou é uma
	
	private String curso;
	private double[] notas;
	
	
	public Aluno() {
		super();
		// Usamos a palavra chave  'super' quando queremos chamar o construtor da super classe (Pessoa)  
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}
	
	

	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia () {
		return 0;
	}
	
	public boolean verificarAprovado () {
		return true;
	}

}
