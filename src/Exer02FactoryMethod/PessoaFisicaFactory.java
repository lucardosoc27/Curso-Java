package Exer02FactoryMethod;

public class PessoaFisicaFactory implements ContribuinteFactory {
	
	@Override
	public Contribuinte criar (String nome, double rendaBruta, String documento) {
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome(nome);
		pf.setRendaBruta(rendaBruta);
		pf.setCpf(documento);
		return pf;
	}
}
