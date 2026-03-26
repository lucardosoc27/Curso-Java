package cursojava.palavrachave.final_.constante;

public class Teste {
	
	public static void main (String [] args) {
		
		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		// Exemplo
		
		System.out.println(Constantes.CURSO_COMPLETO);
		Constantes.CURSO_COMPLETO = "aksjaohsauhs";
		System.out.println(Constantes.CURSO_COMPLETO);
		
		System.out.println(Constantes.URL_BLOG);
		Constantes.URL_BLOG = "ikasuaghsgf";  // Está dando erro porque quando a classe tem a palavra chave final, ela não pode ser modificada
	}
}
