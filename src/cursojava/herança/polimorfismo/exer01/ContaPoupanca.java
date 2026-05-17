package cursojava.herança.polimorfismo.exer01;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;
	
	public ContaPoupanca (String nomeCliente, String numConta, double saldo, int diaRendimento) {
		
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public int getDiaRendimento () {
		return this.diaRendimento;
	}
	
	public void setDiaRendimento (int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	@Override
	public String toString () {
		String s = "Conta Poupança [" +
						" - Dia Rendimento: " + diaRendimento +
							"] - ";
			 s += super.toString();
		return s; 
	}
	
	public boolean calcularNovoSaldo (double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
			
			double rendimento = super.getSaldo() * taxaRendimento;
			double novoSaldo = super.getSaldo() + rendimento;
			
			super.setSaldo(novoSaldo);
			return true;
		}
		
		return false;
	}
}
