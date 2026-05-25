package Exer03FactoryMethod;

public class PeixeFactory implements AnimalFactory {
	
	@Override
	public Animal criar (String nome, int comprimento, double velocidade, String cor, String ambiente, String atributoExtra) {
		Peixe p = new Peixe();
		
		p.setNome(nome);
		p.setComprimento(comprimento);
		p.setVelocidade(velocidade);
		
		if(!cor.isEmpty()) p.setCor(cor);
		if(!ambiente.isEmpty()) p.setAmbiente(ambiente);
		if(!atributoExtra.isEmpty()) p.setCaracteristicas(atributoExtra);
		return p;
	}
}
