package cursojava.herança.polimorfismo.exer01;

import java.util.Calendar;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("*** Teste Conta Bancaria ***");
		
		ContaBancaria contaSimples = new ContaBancaria("Cliente conta Simples", "12345", 100.0);
		
		realizarSaque(contaSimples, 50);
		realizarSaque(contaSimples,70);
		
		System.out.println(contaSimples);
		
		
		System.out.println("\n\n*** Teste Conta Poupança ***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("Cliente Conta Poupança", "54321", 1000.00, 10);
				
		realizarSaque(contaPoupanca, 50);
		
		Calendar hoje = Calendar.getInstance();
		int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);
		
		contaPoupanca.setDiaRendimento(diaHoje);
		
		System.out.println("Dia de rencimendo da Poupança: " + contaPoupanca.getDiaRendimento());
		
		
		double taxa = 0.1;
		if(contaPoupanca.calcularNovoSaldo(taxa)) {
			System.out.println("Rendimento de " + (taxa * 100) + "% aplicado com sucesso. Novo saldo em conta: " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento. Saldo não calculado");
		}
		
		System.out.println("Mudando o dia de rendimento da conta");
		contaPoupanca.setDiaRendimento(diaHoje + 1);
		
		if(contaPoupanca.calcularNovoSaldo(taxa)) {
			System.out.println("Rendimento aplicado com sucesso a conta! Novo saldo: " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Não foi possivel aplicar o rendimento, pois não é o dia de rendimento. Saldo intacto");
		}
		System.out.println(contaPoupanca);
		
		System.out.println("\n\n*** Teste Conta Especial ***");
		
		ContaEspecial contaEspecial = new ContaEspecial("Cliente conta especial", "11111", 500.0, 1000.0);
		
		realizarSaque(contaEspecial, 200);
		realizarSaque(contaEspecial, 500);
		realizarSaque(contaEspecial, 2000);
		
		System.out.println(contaEspecial);
	}
	
		private static void realizarSaque (ContaBancaria conta, double valor) {
		
		if(conta.sacar(valor)) {
			System.out.println("Saque realizado com sucesso! Novo saldo em conta: " + conta.getSaldo());
		} else {
			System.out.println("Saque insuficiante para saque de valor: R$" + valor + "; Saldo da conta: " + conta.getSaldo());
		}
	}
}
