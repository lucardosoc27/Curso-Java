package cursojava.herança;

public class Teste {
	public static void main(String [] args) {
		
		/*Aluno aluno = new Aluno();
		
		Professor professor = new Professor();
		
		Pessoa pessoa = new Pessoa(); 
		
		aluno.setNome("Luã");
		aluno.setTelefoneCelular("71 98890875345");
		professor.setTelefoneCelular(null);
		*/
		
		Pessoa aluno = new Aluno();
		
		aluno.getNome();
		
		Pessoa professor = new Professor();
		
		professor.getNome();
		
		// Fazendo dessa maneira (declarar a super classe e instanciar o tipo da classe filha), eu não tenho acesso aos atributos especificos da classe (aluno e professor) apenas da classe mãe Pessoa
	}
}
