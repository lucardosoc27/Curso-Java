package cursojava.orientacao.objeto.fibonacci.recursivo;

public class Calculadora {
	
	public static int fibonacci (int num) {
		
		if (num < 2) {
			return 1;
		}
		
		return fibonacci (num -1) + fibonacci (num -2);
	}
	
	
	// 5 = 5 + 4 + 3 + 2 + 1
	// 4 = 4 + 3 + 2 + 1
	// 3 = 3 + 2 + 1
	// 2 = 2 + 1
	// 1 = 1
	public static int somatorio (int num) {
		
		if (num == 0) {
			return 1;
		}
		
		return num * somatorio (num -1);
	}
}