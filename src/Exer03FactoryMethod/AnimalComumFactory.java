package Exer03FactoryMethod;

public class AnimalComumFactory implements AnimalFactory {
	
	@Override
	public Animal criar (String nome, int comprimento, double velocidade, String cor, String ambiente, String atributoExtra) {
		Animal a = new Animal();
		
		a.setNome(nome);
		a.setComprimento(comprimento);
		a.setVelocidade(velocidade);
		a.setCor(cor);
		a.setAmbiente(ambiente);
		return a;
	}
}
