package cursojava.orientacao.objeto.thiss;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public Carro (String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		
		this.marca = marca; // Referenciando primeiro o atribudo da classe(marca) e depois referenciando o parametro passado na classe (marca)
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		
	}
	
	
	public Carro (String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo =modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parametros");
	}
	
	public Carro (String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 parametros");
	}
	
	public void exibirAutonomia() {
		
		System.out.println("A autonomia do  é: " + this.capCombustivel * this.capCombustivel);
	}
	
	private double divideKMPorConsumoCombustivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double obterAutonomia() {
		
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.capCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		
		return this.divideKMPorConsumoCombustivel(km);
	}
}
