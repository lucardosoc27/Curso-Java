package ExerPraticando;

public class pagamentoPix implements Pagamento {
	
	@Override
	public void processarPagamento (ContaBancaria conta, double valor) {
		
		if(conta.sacar(valor)) {
			System.out.println("Pagamento via Pix aprovado");
		}
	}

}
