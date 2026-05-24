package cursojava.herança.polimorfismo.exer03;

public class Mamifero extends Animal {
	
	private String alimento;
	
	public Mamifero () {
		
		super();
		this.setCor("Castanho");
		this.setAlimento("Mel");
		this.setAmbiente("Terra");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString () {
		String s = super.toString() +
				"\nAlimento: " + alimento;
		return s;
	}
}
