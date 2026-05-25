package Exer03FactoryMethod;

public interface AnimalFactory {
	
	Animal criar (String nome, int comprimento, double velocidade, String cor, String ambiente, String atributoExtra);
}
