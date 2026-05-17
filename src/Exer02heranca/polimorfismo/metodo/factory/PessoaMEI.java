package Exer02heranca.polimorfismo.metodo.factory;

public class PessoaMEI extends Contribuinte {
	
	private String cnpj;
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	@Override
	public double calcularImpostos() {
		return 850.00;
	}
	
	public String toString() {
		String s = "Pessoa MEI";
		super.toString();
		s += "Cpj: " + cnpj;
		s += "Imposto a pagar: " + calcularImpostos();
		s += " ]";
		return s;
		
	}
}
