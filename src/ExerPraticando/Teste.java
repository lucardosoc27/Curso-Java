package ExerPraticando;

import java.util.Calendar;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Teste Conta Bancaria ***");
		
		ContaBancaria contaSimples = new ContaBancaria("Cliente conta simples", "12345", 100.0);
		
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples, 70);
		System.out.println(contaSimples);
		
		System.out.println("\n\n*** Teste Conta Poupança ***");
		
		ContaPoupanca minhaPoupanca = new ContaPoupanca("Cliente conta poupança", "54321", 1000.00, 10);
		
		realizarSaque(minhaPoupanca, 50);
		
		
		Calendar hoje = Calendar.getInstance();
		int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);
		
		minhaPoupanca.setDiaRendimento(diaHoje);
		
		System.out.println("Dia de rendimento da Poupança: " + minhaPoupanca.getDiaRendimento());
		
		double taxa = 0.1;
		if (minhaPoupanca.calcularNovoSaldo(taxa)) {
			System.out.println("Rendimento de " + (taxa * 100) + "% aplicado com sucesso! Novo saldo em conta: " + minhaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento. Novo saldo não calculado");
		}
		
		System.out.println("Mudando dia de Rendimendo da conta");
		minhaPoupanca.setDiaRendimento(diaHoje + 1);
		
		
		if (minhaPoupanca.calcularNovoSaldo(taxa)) {
			System.out.println("Rendimento aplicado com sucesso a conta! Novo saldo: " + minhaPoupanca.getSaldo());
		} else {
			System.out.println("Não foi possivel aplicar o rendimento, pois não é o dia de rendimento. Saldo intacto");
		}
		
		System.out.println(minhaPoupanca);
		
		System.out.println("\n\n*** Teste Conta Especial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial("Cliente conta especial", "11111", 500.0, 1000.0);
		
		realizarSaque(contaEspecial, 200);
		realizarSaque(contaEspecial, 500);
		realizarSaque(contaEspecial, 2000);
		
		System.out.println(contaEspecial);
		
		
		System.out.println("\n\n*** Teste Exercicio Factory Method ***");
		
		ContaBancaria minhaConta = new ContaEspecial("Luã", "77777", 0.0, 500.0);
		
		System.out.println("\nTeste de entrada");
		minhaConta.depositar(1050);
		System.out.println("Deposito realizado com sucesso. Novo saldo em conta: " + minhaConta.getSaldo());
		
		System.out.println("\nTeste de saida");
		
		Pagamento p1 = ProcessamentoFactory.criarPagamento("Pix");
		p1.processarPagamento(minhaConta, 150.0);
		
		Pagamento p2 = ProcessamentoFactory.criarPagamento("Boleto Bancario");
		p2.processarPagamento(minhaConta, 200.0);
		
		Pagamento p3 = ProcessamentoFactory.criarPagamento("Cartao de Credito");
		p3.processarPagamento(minhaConta, 50.0);
		
		System.out.println("Saldo total na conta do cliente: " + minhaConta.getNomeCliente() + ". R$ " + minhaConta.getSaldo());
		
		System.out.println(minhaConta);
		
	}
	
	private static void realizarSaque (ContaBancaria conta, double valor) {
		
		if (conta.sacar(valor)) {
			System.out.println("Saque realizado com sucesso. Novo saldo em conta: " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de valor: " + valor + "; saldo em conta: " + conta.getSaldo());
		}
	}

}
