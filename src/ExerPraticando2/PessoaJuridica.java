package ExerPraticando2;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	@Override
	public double calcularImpostos () {
		
		return this.getRendaBruta() * 0.1;
	}
	
	@Override
	public String toString () {
		String s = "Pessoa Juridica [" +
					super.toString() +
					" | Cnpj do cliente: " + cnpj +
					  " | Imposto a ser pago: " + calcularImpostos() +
						" ]";
		return s;
	}
}
