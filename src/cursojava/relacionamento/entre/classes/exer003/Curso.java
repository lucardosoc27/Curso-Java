package cursojava.relacionamento.entre.classes.exer003;
import java.util.List;
import java.util.ArrayList;

public class Curso {
	
	private String nome;
	private String horario;
	private List<Professor> professores = new ArrayList<>();
	private List<Aluno> alunos = new ArrayList<>();
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getHorario () {
		return this.horario;
	}
	
	public void setHorario (String horario) {
		this.horario = horario;
	}
	
	public List<Professor> getProfessores () {
		return this.professores;
	}
	
	public void setProfessores (List<Professor> professores) {
		this.professores = professores;
	}
	
	public List<Aluno> getAlunos () {
		return this.alunos;
	}
	
	public void setAlunos (List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public double obterMediaTotal () {
		
		double somaTotal = 0;
		
		for (Aluno a : alunos) { 
			somaTotal += a.obterMedia();
		}
		
		return somaTotal / alunos.size();
	}
	
	public String toString () {
		String info = "Nome: " + nome + "\n" +
					   "Horario: " + horario + "\n\n";
		
		if (professores != null && !professores.isEmpty()) {
			info += "----- PROFESSOR -----\n";
			for (Professor p : professores) {
				info += p.toString() + "\n";
			}
			
			if (alunos != null && !alunos.isEmpty()) {
				info += "----- ALUNOS DA TURMA -----\n";
				for(Aluno a : alunos) {
					info += a.toString() + "\n";
				}
				
				return info += "\nMédia geral da turma: " + obterMediaTotal() + "\n";
			}
		}
		
		return info;
	}
}