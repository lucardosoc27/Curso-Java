package ExerPraticando2;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double calcularImpostos () {
		
		double renda = this.getRendaBruta();
		
		if (renda <= 1400) {
			return 0;
		} 
		
		else if (renda > 1400 && renda <= 2100) { 
			return (renda * 0.1) - 100;
		}
		
		else if (renda >  2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}
		
		else if (renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		
			return (renda * 0.30) - 700;
	}
	
	@Override
	public String toString () {
		String s = "Pessoa Fisica [" + 
					super.toString() +
					" | CPF do cliente: " + cpf + 
					 " | Imposto a ser pago: " + calcularImpostos() +
					  " ]";
		return s;
					
	}
}
