package Exer02FactoryMethod;

public class PessoaJuridicaFactory implements ContribuinteFactory {
		
	@Override
	public Contribuinte criar (String nome, double rendaBruta, String documento) {
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNome(nome);
		pj.setRendaBruta(rendaBruta);
		pj.setCnpj(documento);
		return pj;
	}
}
