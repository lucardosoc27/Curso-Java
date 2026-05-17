package cursojava.herança.polimorfismo.exer01;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
		
	public ContaBancaria (String nomeCliente, String numConta, double saldo) {
		
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente () {
		return this.nomeCliente;
	}
	
	public void setNomeCliente (String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getnumConta () {
		return this.numConta;
	}
	
	public void setNumConta (String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo () {
		return this.saldo;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString () {
		String s = "Conta Bancaria [";
		s += "Nome Cliente: " + nomeCliente +
				" - Numero da conta: " + numConta +
				 "- Saldo do Cliente: " + saldo +
				 	"]";
		return s; 
	}
	
	public void depositar (double valor) {
		
		if(valor > 0) {
			saldo += valor;
		} else {
			System.out.println("Valor insuficiante para deposito");
		}
	}
	
	public boolean sacar (double valor) {
		
		if(valor <= 0 || valor > saldo) {
			return false;
		}
		
		saldo -= valor;
		return true;
	}
}

		
