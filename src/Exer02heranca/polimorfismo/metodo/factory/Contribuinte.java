package Exer02heranca.polimorfismo.metodo.factory;

public abstract class Contribuinte {
	
	private String nome;
	private double rendaBruta;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRendaBruta() {
		return this.rendaBruta;
	}
	
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calcularImpostos();
	
	@Override
	public String toString () {
		String s = "Nome: " + nome +
					 "Renda bruda: " + rendaBruta;
		return s;
	}

}
