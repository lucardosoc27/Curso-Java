package Exer02heranca.polimorfismo.metodo.factory;

public class PessoaJuridicaFactory implements ContribuinteFactory {
	
	@Override
	public Contribuinte criar (String nome, double rendaBruta, String documento) {
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setNome(nome);
		pj.setCnpj(documento);
		pj.setRendaBruta(rendaBruta);
		return pj;
	}
}
