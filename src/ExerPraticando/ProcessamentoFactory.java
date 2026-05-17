package ExerPraticando;

public class ProcessamentoFactory {
	
	public static Pagamento criarPagamento (String tipo) {
		
		if (tipo.equalsIgnoreCase("Pix")) {
			return new pagamentoPix();
		} else if (tipo.equalsIgnoreCase("Boleto Bancario")) {
			return new pagamentoBoleto();
		} else if (tipo.equalsIgnoreCase("Cartao de Credito")) {
			return new pagamentoCartao();
		}
		return null;
	}
}
