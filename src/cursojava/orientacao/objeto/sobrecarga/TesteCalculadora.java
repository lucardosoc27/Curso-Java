package cursojava.orientacao.objeto.sobrecarga;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		Scanner scan = new Scanner(System.in);
		
		calc.soma(5, 5);
		calc.soma (2.0, 2.0);
		
		 // MinhaCalculadora.soma(5, 5); utilizando o 'static' depois do public e antes do tipo do metodo (int, double etc) eu poderia chamar o metodo sem instanciar eles declarando MinhaCal.. cal...
		
		System.out.println("Informe quantos numeros deseja somar: ");
		int tamanho = scan.nextInt();
		
		int numeros [] = new int [tamanho];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o numero na posicao " + (i+1) + ": ");
			numeros[i] = scan.nextInt();
		}
		
		int resultado = calc.soma(numeros);
		
		System.out.println("O resultado da soma: " + resultado);
		
		scan.close();
	}
}
