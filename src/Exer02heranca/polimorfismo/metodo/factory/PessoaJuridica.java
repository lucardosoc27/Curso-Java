package Exer02heranca.polimorfismo.metodo.factory;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public double calcularImpostos() {
		return this.getRendaBruta() * 0.1;
	}
	
	public String toString() {
		String s = "Pessoa Juridica";
		super.toString();
		s += "Cnpj: " + cnpj;
		s += "Imposto a ser pago: " + calcularImpostos();
		return s;
	}
	

}
