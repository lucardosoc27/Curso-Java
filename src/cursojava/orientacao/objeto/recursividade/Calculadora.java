package cursojava.orientacao.objeto.recursividade;

public class Calculadora {
	
	public static int fatorialNaoRecursivo (int num) {  // Metodo nao resurvido
		
		if (num == 0) {
			return 1;
		}
		int total = 1;
		for (int i = num; i > 1; i--) {
			total *=1;
		}
		return total;
	}
	
	//fatorial(5) = 5 * fatorial(4)
	//fatorial(4) = 4 * fatorial(3)
	//fatorial(3) = 3 * fatorial(2)
	//fatorial(2) = 2 * fatorial(1)
	//fatorial(1) = 1 * fatorial(0)
	//fatorial(0) = 1;
	public static int fatorial (int num) { // Metodo recursivo
		
		if ( num == 0) {
			return 1;
		}
		
		return num * fatorial(num -1);
	} 
}
 
// Metodo recursivos: São mais simples de ler e utilizados principalmente em estrutura de dados (Algoritmo de arvore etc)