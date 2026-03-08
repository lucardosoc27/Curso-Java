package cursojava.orientacao.objeto.construtor;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro () { // Ter isso daqui é a mesma coisa que ter o   = new ...
		System.out.println("A classe  foi instanciada");
		numPassageiros = 5;
		capCombustivel = 150;
	}
	
	public Carro (String marca_, String modelo_ , int numPassageiros_, int capCombustivel_, double consumoCombustivel_) {
		
		this.marca = marca_;
		this.modelo = modelo_;	
		this.numPassageiros = numPassageiros_;
		this.capCombustivel = capCombustivel_;
		this.consumoCombustivel = consumoCombustivel_;
	}

	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do  é: " + capCombustivel * consumoCombustivel);
	}
	
	double obterAutonomia() {
		
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}

