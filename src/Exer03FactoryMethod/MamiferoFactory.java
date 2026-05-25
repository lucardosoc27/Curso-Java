package Exer03FactoryMethod;

public class MamiferoFactory implements AnimalFactory {
	
	@Override
	public Animal criar (String nome, int comprimento, double velocidade, String cor, String ambiente, String atributoExtra) {
		Mamifero m = new Mamifero();
		
		m.setNome(nome);
		m.setComprimento(comprimento);
		m.setVelocidade(velocidade);
		
		if (!cor.isEmpty()) m.setCor(cor);
		if (!ambiente.isEmpty()) m.setAmbiente(ambiente);
		if (!atributoExtra.isEmpty()) m.setAlimento(atributoExtra);
		return m;
	}
}
