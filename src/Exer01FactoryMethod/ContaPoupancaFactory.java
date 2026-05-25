package Exer01FactoryMethod;

public class ContaPoupancaFactory implements ContaFactory {
	
	@Override
	public ContaBancaria criar (String nomeCliente, String numConta, double saldo, double limite, int diaRendimento) {
		return new ContaPoupanca(nomeCliente, numConta, saldo, diaRendimento);
	}
}
