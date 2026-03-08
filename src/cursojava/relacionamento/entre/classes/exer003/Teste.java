package cursojava.relacionamento.entre.classes.exer003;

import java.util.Scanner;

public class Teste {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("Entre com o nome do curso: ");
		String nome = scan.nextLine();
		
		System.out.println("Entre com o horario do curso: ");
		String horario = scan.nextLine();
		
		System.out.println("Entre com o nome do Professor: ");
		String nomeProf = scan.nextLine();
		
		System.out.println("Entre com o departamento do Professor: ");
		String depProf = scan.nextLine();
		
		System.out.println("Entre com o email do Professor: ");
		String emailProf = scan.nextLine();
		
		Curso curso = new Curso ();
		
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor professores = new Professor (nomeProf, depProf, emailProf);
		
		curso.getProfessores().add(professores);
		
		System.out.println("\n======= FICHA DO ALUNO =======\n");
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com o nome do Aluno: ");
			String nomeAluno = scan.nextLine();
			
			System.out.println("Entre com a matricula do Aluno: ");
			String matAluno = scan.nextLine();
			
			double[] notas = new double [4];
			
			for (int j = 0; j < 4; j++) {
				System.out.println("Entre com a nota " + (j + 1) + ": ");
				notas[j] = scan.nextDouble();
			}
				
				scan.nextLine();
				
				Aluno alunos = new Aluno (nomeAluno, matAluno, notas);
				
				curso.getAlunos().add(alunos);
		}
		
		System.out.println("\n======== FICHA DO CURSO ========\n");
		System.out.println(curso);
		scan.close();
	}
}