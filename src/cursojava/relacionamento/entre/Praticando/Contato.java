package cursojava.relacionamento.entre.Praticando;

import java.util.List;
import java.util.ArrayList;

public class Contato {
	
	private String nome;
	private Endereco enderecos;
	private List <Telefone> telefones;
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco () {
		return this.enderecos;
	}
	
	public void setEndereco (Endereco enderecos) {
		this.enderecos = enderecos;
	}
	
	public List<Telefone> getTelefones () {
		return this.telefones;
	}
	
	public void setTelefones (List<Telefone> telefones) {
		this.telefones = telefones;
	}
	
	public String toString () {
		String info = "Ficha do contato" + "\n\n" +
					   "Nome: " + nome + "\n" +
					   (enderecos != null ? enderecos: "Endereço não encontrado") + "\n";
		
		if (telefones != null && !telefones.isEmpty()) {
			int contador = 0;
			for (Telefone t : telefones) {
				if (contador == 0) {
					info += "Ficha do telefone\n\n";
				} else {
					info += "Ficha do telefone " + contador + "\n\n";
				}
				info += t.toString();
				contador++;
			}
		} else {
			info += "Ficha do telefone não encontrado";
		}
		return info;
	}
}
