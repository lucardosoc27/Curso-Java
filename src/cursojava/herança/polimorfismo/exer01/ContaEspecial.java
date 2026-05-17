package cursojava.herança.polimorfismo.exer01;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	
	public ContaEspecial (String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}
	
	public double getLimite () {
		return this.limite;
	}
	
	public void setLimite (double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString () {
		String s = "Conta Especial [" + 
					" - Limite especial: " + limite +
						"] - ";
		s += super.toString();
		return s;
	}
	
	public boolean sacar (double valor) {
		
		if (valor <= 0) {
			return false;
		}
		
		if (valor > (super.getSaldo() + this.limite)) {
			return false;
		}
		
		super.setSaldo(super.getSaldo() - valor);
		return true;
	}

}
