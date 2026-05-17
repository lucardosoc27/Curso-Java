package Exer02heranca.polimorfismo.metodo.factory;

public interface ContribuinteFactory {
	
	Contribuinte criar(String nome, double rendaBruta, String Documento);
}
