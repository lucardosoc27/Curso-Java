package Exer01FactoryMethod;

public interface ContaFactory {
	
	ContaBancaria criar (String nomeCliente, String numConta, double saldo, double limite, int diaRendimento);

}
