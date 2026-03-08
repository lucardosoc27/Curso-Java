package cursojava.relacionamento.entre.classes.exer003;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double [] notas;
	
	public Aluno (String nome, String matricula, double [] notas) {
		
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getMatricula () {
		return this.matricula;
	}
	
	public void setMatricula (String matricula) {
		this.matricula = matricula;
	}
	
	public double [] getNotas () {
		return this.notas;
	}
	
	public void setNotas (double [] notas) {
		this.notas = notas;
	}
	
	public String toString () {
		String info = "====== Aluno ======\n\n" +
						"Nome: " + nome + "\n" +
						 "Matricula: " + matricula + "\n" +
						  "Notas: ";
		
		double soma = 0;
		
		for (double nota : notas) {
			soma += nota;
			info += nota + " / ";
		}
		
		double media = soma / 4;
		info += "\nMédia: " + media + "\n";
		
		if (media >= 7) {
			info += "Aluno Aprovado";
		} else {
			info += "Aluno Reprovado";
		}
		return info + "\n\n==================\n";
	}
	
	public double obterMedia () {
		
		double soma = 0;
		
		for (double nota : notas) {
			soma += nota;
		}
		
		return soma / 4;
	}
}