package cursojava.relacionamento.entre.Praticando;

import java.util.Scanner;
import java.util.ArrayList;

public class Lanchonete {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Produto> carrinho = new ArrayList();
		int opcao = 0;
		
		System.out.println("Bem-vindo a Lanchonete");
		
		while (opcao != 4) {
			System.out.println("\n Menu");
			System.out.println("1. Adicionar X-Burguer (RS 20.0)");
			System.out.println("2. Adicionar Batata Frita (RS 10.0");
			System.out.println("3. Adicionar Refrigerante (R$ 5.0");
			System.out.println("4. Fechar a conta");
			System.out.println("Escolha uma opcao");
			
			try {
				
				opcao = scan.nextInt();
				
				switch (opcao) {
				
				case 1 -> {
					carrinho.add(new Produto("X-Burguer", 20.0));
					System.out.println("-> X-Burguer adicionado com sucesso");
				}
				
				case 2 -> {
					carrinho.add(new Produto("Batata Frita", 10.0));
					System.out.println("-> Batata frita adicionado com sucesso");
				}
				
				case 3 -> {
					carrinho.add(new Produto("Refrigerante", 5.0));
					System.out.println("-> Refrigerante adicionado com sucesso");
				}
			
				case 4 -> System.out.println("Encerrando conta");
				
				default -> System.out.println("Erro. Digite apenas numeros");
			}
			
						
			} catch (Exception erro) {
				System.out.println("Erro. Digite aamana numeros");
				scan.nextLine();
				
			}
		}
		
		System.out.println("Conta fechada");
		double total = 0;
		
		for (Produto item : carrinho) {
			System.out.println(item.toString());
			total += item.preco();
		}
		
		System.out.println("Total a pagar: " + total);
		scan.close();

	}

}
