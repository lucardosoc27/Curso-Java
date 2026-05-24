package Exer02heranca.polimorfismo.metodo.factory;

public class main {

	public static void main(String[] args) {
		
		ContribuinteFactory fabricaPF = new PessoaFisicaFactory();
		Contribuinte cliente1 = fabricaPF.criar("Luã Cardoso", 3200, "111.222.333-44"); 
		
		ContribuinteFactory fabricaPJ = new PessoaJuridicaFactory();
		Contribuinte cliente2 = fabricaPJ.criar("Maristela", 4500, "12.345.678/0001-99");
		
		ContribuinteFactory fabricaMEI = new PessoaMEIFactory();
		Contribuinte cliente3 = fabricaMEI.criar("Maristela", 5500, "98.765.432/0001-11");
		
		System.out.println(cliente1);
		System.out.println();
		System.out.println(cliente2);
		System.out.println();
		System.out.println(cliente3);
	}
}