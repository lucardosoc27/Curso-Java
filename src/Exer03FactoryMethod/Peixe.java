package Exer03FactoryMethod;

public class Peixe extends Animal {
	
private String caracteristicas;
	
	public Peixe () {
		
		super();
		this.setPatas(0);
		this.setAmbiente("Mar (Padrão)");
		this.setCor("Cinza");
		this.setCaracteristicas("Com barbatanas e cauda");
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	@Override
	public String toString () {
		String s = super.toString() + 
				"\nCaracteristicas: " + caracteristicas;
		return s;
	}
}
