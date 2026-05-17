package orientacao.objeto.classe.object1;

public class teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da computação");
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "skjaodij";
		String s2 = "skjaodiJ";
		
		// equals para comparar objetos e equalsIgnoreCase para comparar string
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		
		aluno2.setCurso("Rede de Computadores");
		double [] notas2 = {10, 9, 8, 7};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));	
	}
}
