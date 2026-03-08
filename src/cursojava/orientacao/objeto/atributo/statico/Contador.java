package cursojava.orientacao.objeto.atributo.statico;

public class Contador {
	
	private static int cont; //Atributo statico
	
	public Contador () {
		cont++;
	}
	
	public static void incrementar () {
		cont++;
	}
	
	public static void zerar () {
		cont = 0;
	}
	
	public static int obterValor () {
		return cont;
	}
}
