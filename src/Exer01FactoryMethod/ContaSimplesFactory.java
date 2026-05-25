package Exer01FactoryMethod;

public class ContaSimplesFactory implements ContaFactory {
	
	@Override
	public ContaBancaria criar (String nomeCliente, String numConta, double saldo, double limite, int diaRendimento) {
		return new ContaBancaria(nomeCliente, numConta, saldo);
	}
}
