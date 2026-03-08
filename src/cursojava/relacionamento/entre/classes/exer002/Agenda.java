package cursojava.relacionamento.entre.classes.exer002;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	
	private String nome;
	private List<Contato> contatos = new ArrayList<>();
	
	public Agenda () {
		
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public List<Contato> getContatos () {
		return this.contatos;
	}
	
	public void setContatos (List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	public String toString () {
		String info = "Dados da agenda \n" +
					  (nome != null ? nome: "Nome não encontrado");
		
		if (contatos != null && !contatos.isEmpty()) {
			int contador = 1;
			for (Contato c : contatos) {
				info += "Ficha do contato " + contador + "\n";
				info += c.toString() + "\n";
				contador++;
			}
		} else {
			info += "Contato nao encontrado";
		}
		return info;
	}
	
}
