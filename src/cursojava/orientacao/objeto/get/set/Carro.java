package cursojava.orientacao.objeto.get.set;

public class Carro {
	
	private String marca;
	private String modelo;
	private double capCombustivel;
	private int numPassageiros;
	private double consumoCombustivel;
	private double litros;
	
	public void abastecer (double litros) {
		
		if (litros > 0) {
			this.capCombustivel += litros;
		}
		
		this.capCombustivel += litros;
	}
	
	public double getLitros () {
		return this.litros;
	}
	
	public void setLitros (double litro) {
		if (litros >= 0 ) {
			this.capCombustivel += litros;
		}
		this.litros = litros;
	}
	
	public String getMarca () {
		return this.marca;
	}
	
	public void setMarca (String marca) {
		this.marca = marca;
	}
	
	public String getModelo () {
		return this.modelo;
	}
	
	public void setModelo (String modelo) {
		this.modelo = modelo;
	}
	
	public double getCapCombustivel () {
		return this.capCombustivel;
	}
	
	public void setCapCombustivel (double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}
	
	public int getNumPassageiros () {
		return this.numPassageiros;
	}
	
	public void setNumPassageiros (int numPassageiros) {
		
		if (numPassageiros <= 0) {
			throw new IllegalArgumentException("Número de passageiros invalido");
		}
		
		this.numPassageiros = numPassageiros;
	}
	
	public double getConsumoCombustivel () {
		return this.consumoCombustivel;
	}
	
	public void setConsumoCombustivel (double consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}
	
	public double getAutonomia () {
		return this.capCombustivel * this.consumoCombustivel;
	}
}
