package cursojava.orientacao.objeto.recursividade;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int fatorialRN = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialRN);
		
		int fatorialR = Calculadora.fatorial(5);
		System.out.println(fatorialR);
	}

}
