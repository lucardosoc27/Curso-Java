package Exer02heranca.polimorfismo.metodo.factory;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double calcularImpostos() {
		double renda = this.getRendaBruta();
		
		if (renda <= 1400) {
			return 0;
			
		}else if (renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
			
		} else if (renda  >  2100 && renda <= 2800) {
			return (renda * 0.5) - 270;
			
		} else if (renda > 2800 && renda <= 3600) { 
			return (renda * 0.25) - 500;
			
		}
		
		return (renda * 0.3) - 700;
	}
	
	@Override
	public String toString() {
		String s = "Pessoa fisica[";
		super.toString();
		s += "Cpf: " + cpf;
		s += "Imposto a ser pago: " + calcularImpostos();
		s += " ]";
		return s;
	}
}
