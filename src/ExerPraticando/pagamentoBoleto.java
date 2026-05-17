package ExerPraticando;

public class pagamentoBoleto implements Pagamento{
	
	@Override
	public void processarPagamento (ContaBancaria conta, double valor) {
		
		if(conta.sacar(valor)) {
			System.out.println("Boleto Bancario aprovado");
		}
	}

}
