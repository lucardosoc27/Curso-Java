package cursojava.relacionamento.entre.classes.exer002;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o nome da Agenda: ");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda();
		
		agenda.setNome(nome);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as informaçoes do contato " + (i + 1) + "\n");
			
			System.out.println("Entre com o nome: ");
			String nomeContato = scan.nextLine();
			
			System.out.println("Entre com o telefone: ");
			String telefone = scan.nextLine();
			
			System.out.println("Entre com o e-mail");
			String email = scan.nextLine();
			
			Contato contato = new Contato(nomeContato, telefone, email);
			agenda.getContatos().add(contato);
			
		}
		
		System.out.println(agenda);
		scan.close();
	}
}
