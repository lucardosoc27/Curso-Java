package cursojava.orientacao.objeto.exercicio02;

public class ContaCorrente {
	
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double saldo;
	
	
	public ContaCorrente () {
		
	}
	
	public ContaCorrente (String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.saldo = saldo;
	}
	
	public String getNumero () {
		return this.numero;
	}
	
	public void setNumero (String numero) {
		this.numero = numero;
	}
	
	public String Agencia () {
		return this.agencia;
	}
	
	public void setAgencia (String agencia) {
		this.agencia = agencia;
	}
	
	public boolean isEspecial () {
		return this.especial;
	}
	
	public void setEspecial (boolean especial) {
		this.especial = especial;
	}
	
	public double getLimiteEspecial () {
		return this.limiteEspecial;
	}
	
	public void setLimiteEspecial (double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public double getSaldo () {
		return this.saldo;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public boolean realizarSaque (double quantiaASacar) {
		// Tem saldo na conta
		
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else { // Caso nao tenha saldo na conta
			if (especial) {
				// Verificar se tem limite especial no saldo
				double limite = limiteEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}
			} else {
				return false; // Não é especial e não tem saldo suficiente
			}
		}
	}
		
		public void depositar (double valorDepositado) {
			saldo += valorDepositado;
		}
		
		public void consultarSaldo () {
			System.out.println("Saldo atual da conta = " + saldo);
		}
		
		public boolean verificarUsoChequeEspecial () {
			return saldo < 0;
	}
	
}