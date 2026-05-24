package ExerPraticando;

public class pagamentoCartao implements Pagamento {
	
	@Override
	public void processarPagamento (ContaBancaria conta, double valor) {
		
		if(conta.sacar(valor)) {
			System.out.println("Pagamaento via Cartao de Credito aprovado");
		}
	}
}
