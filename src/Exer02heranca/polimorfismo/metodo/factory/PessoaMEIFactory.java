package Exer02heranca.polimorfismo.metodo.factory;

public class PessoaMEIFactory implements ContribuinteFactory {
	
	@Override
	public Contribuinte criar(String nome, double rendaBruta, String documento) {
	PessoaMEI mei = new PessoaMEI();
		
		mei.setNome(nome);
		mei.setCnpj(documento);
		mei.setRendaBruta(rendaBruta);
		return mei;
	}

}
