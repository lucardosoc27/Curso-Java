package Exer01FactoryMethod;

import java.util.Calendar;

public class Main {
	
	public static void main(String[] args) {
		
		ContaFactory fabricaContaSimples = new ContaSimplesFactory();
		ContaFactory fabricaContaEspecial = new ContaEspecialFactory();
		ContaFactory fabricaContaPoupanca = new ContaPoupancaFactory();
		
		System.out.println("*** Tentando Conta Bancaria ***");
		
		ContaBancaria contaSimples = fabricaContaSimples.criar("Conta Simples", "12345", 100.0,0.0, 0);
		
		realizarSaque(contaSimples, 50);
        realizarSaque(contaSimples, 70);
        System.out.println(contaSimples);
        
        System.out.println("\n\n*** Teste Conta Poupança ***");
        
        ContaPoupanca minhaPoupanca = (ContaPoupanca) fabricaContaPoupanca.criar("Cliente conta poupança", "54321", 1000.00, 0.0, 10);
        
        realizarSaque(minhaPoupanca, 50);
        
        Calendar hoje = Calendar.getInstance();
        int diaHoje = hoje.get(Calendar.DAY_OF_MONTH);
        
        minhaPoupanca.setDiaRendimento(diaHoje);
        System.out.println("Dia de rendimento" + minhaPoupanca.getDiaRendimento());
        
        double taxa= 0.1;
        
        if (minhaPoupanca.calcularNovoSaldo(taxa)) {
            System.out.println("Rendimento de " + (taxa * 100) + "% aplicado! Novo saldo: " + minhaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento. Novo saldo não calculado");
        }
        
        
        System.out.println("\n\n*** Teste Conta Especial ***");
        ContaBancaria minhaContaEspecial = fabricaContaEspecial.criar("Cliente conta especial", "11111", 500.0, 1000.0, 0);
        
        realizarSaque(minhaContaEspecial, 200);
        realizarSaque(minhaContaEspecial, 500);
        realizarSaque(minhaContaEspecial, 2000);
        
        System.out.println(minhaContaEspecial);
	}
        
        private static void realizarSaque (ContaBancaria conta, double valor) {
        	
        	if(conta.sacar(valor)) {
        		System.out.println("Saque realizado com sucesso. Novo saldo em conta: " + conta.getSaldo());
        	} else {
        		System.out.println("Saldo insuficiante para saque de valor: " + valor + "; saldo em conta: " +conta.getSaldo());
        	}
        }
	}
