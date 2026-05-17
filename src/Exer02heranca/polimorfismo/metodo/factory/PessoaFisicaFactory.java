package Exer02heranca.polimorfismo.metodo.factory;

public class PessoaFisicaFactory implements ContribuinteFactory {
	
	@Override
	public Contribuinte criar(String nome, double rendaBruta, String documento) {
		PessoaFisica pf = new PessoaFisica();
		
		pf.setNome(nome);
		pf.setCpf(documento);
		pf.setRendaBruta(rendaBruta);
		return pf;
	}
}
