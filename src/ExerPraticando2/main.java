package ExerPraticando2;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		ContribuinteFactory fabricaPF = new PessoaFisicaFactory();
		ContribuinteFactory fabricaPJ = new PessoaJuridicaFactory();
		
		List<Contribuinte> contribuintes = new ArrayList<>();
		
		contribuintes.add(fabricaPF.criar("Luã", 5000, "065-874-525-58"));
		contribuintes.add(fabricaPJ.criar("Ronaldo", 3500, "111-092/55"));
		contribuintes.add(fabricaPJ.criar("Maristela", 2500, "5555-00/23"));
		
		for (Contribuinte c : contribuintes) {
			System.out.println(c.toString());
			System.out.println();
		}
	}
}
