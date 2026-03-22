package cursojava.herança.polimorfismo.sobrecarga.metodos;

public class Aluno extends Pessoa {
	
	//Herança no java, é um tipo de relacionamento: é um ou é uma
	
	private String curso;
	private double[] notas;
	
	
	public void verificarAcesso() {
		
		this.nomeVisibilidade = "testando";
		super.nomeVisibilidade = "testando2";
		
	}
	
	public Aluno() {
		super();
		// Usamos a palavra chave  'super' quando queremos chamar o construtor da super classe (Pessoa)  
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso, double [] notas) {
		super(nome, endereco, telefone); // Enquanto a palavra reservada 'super' faz referencia a super classe 
		this.curso = curso;
		this.notas = notas;    // a palavra reservada 'this' faz referencia a propria classe
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
	
	public String obterEtiquetaEndereco () {
		
		String s = "Endereço do Aluno: ";
		s += super.getEndereco();
		
		return s;
	}

}
