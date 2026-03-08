package cursojava.orientacao.objeto.exercicio05;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int num;
		
		do {
			System.out.println("Entre com um numero positivo");
			num = scan.nextInt();
			
			if (num < 0) {
				System.out.println("Número invalido, tente novamente");
			}
			
		} while (num < 0);
		System.out.println(Calculadora.fatorial(num));
	}

}
