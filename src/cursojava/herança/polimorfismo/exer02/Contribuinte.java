package cursojava.herança.polimorfismo.exer02;

public abstract class Contribuinte {
	
	private String nome;
	private double rendaBruta;
	
	public Contribuinte () {
		
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getRendaBruta () {
		return this.rendaBruta;
	}
	
	public void setRendaBruta (double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public abstract double calcularImposto ();
	
	@Override
	public String toString () {
		String s = "Nome: " + nome;
					s += "; Renda Bruta: " + rendaBruta;
					return s;
	}
}
