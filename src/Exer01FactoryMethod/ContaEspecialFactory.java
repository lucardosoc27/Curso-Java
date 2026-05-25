package Exer01FactoryMethod;

public class ContaEspecialFactory implements ContaFactory {
	
	@Override
	public ContaBancaria criar (String nomeCliente, String numConta, double saldo, double limite, int diaRendimento) {
		return new ContaEspecial(nomeCliente, numConta, saldo, limite);
	}
}
