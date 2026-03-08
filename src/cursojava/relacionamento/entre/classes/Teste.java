package cursojava.relacionamento.entre.classes;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		
			//contato.setNome("Luã");
			//contato.setEndereco("Colinas");
			//contato.setTelefone("71 988652185");
		
		
		// Criar objeto nome - Relacionamento tem-um nome
		
		Nome nomes = new Nome ();
		
		nomes.setNome("Luã");
		nomes.setSobrenome("Cardoso");
		nomes.setSexo("Homem");
		nomes.setCivil("Solteiro");
		
		contato.setNomes(nomes);
		
		//Criar objeto endereco - Relacionamento tem-um endereço
		
		Endereco end = new Endereco ();
		
		end.setNomeRua("Rua game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("999999");
		
		Endereco end2 = new Endereco ();
		
		end2.setNomeRua("Rua dos tronos");
		end2.setNumero("n/a");
		end2.setComplemento("- ");
		end2.setCidade("Kings Landing");
		end2.setEstado("Westelis");
		end2.setCep("888888");
		
		Endereco [] enderecos = new Endereco[2];
		
		enderecos[0] = end;
		enderecos[1] = end2;
		
		contato.setEnderecos(enderecos);
		
			// contato.setEndereco(end);
		
		// Criar objeto telefone - Relacionamento tem-um telefone
		
		Telefone tel = new Telefone();
		
		tel.setTipo("Celular");
		tel.setAdd("71");
		tel.setNumero("9886521855");
		
		Telefone tel2 = new Telefone ();
		
		tel2.setTipo("Casa");
		tel2.setAdd("71");
		tel2.setNumero("988446-4646");
		
		Telefone tel3 = new Telefone ();
		
		tel3.setTipo("Apartamento");
		tel3.setAdd("71");
		tel3.setNumero("9886537-6189");
		
		Telefone [] telefones = new Telefone[3];
		
		telefones[0] = tel;
		telefones[1] = tel2;
		telefones[2] = tel3;
		
		contato.setTelefones(telefones);
		
		// contato.setTelefone(tel);
		
		// Teste saida no console
		
		if (contato != null && contato.getNomes() != null) {
			System.out.println(contato.getNomes().getNome() + " " + contato.getNomes().getSobrenome() + " - " + contato.getNomes().getCivil() + " - " + contato.getNomes().getSexo());
		}
		
		/*if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade() + " - " + contato.getEndereco().getNomeRua());
		}*/
		
		if (contato != null && contato.getEnderecos() != null) {
			for (Endereco e: contato.getEnderecos()) {
				System.out.println(e.getCidade() + " " + e.getNomeRua() + " - " + e.getEstado());
				
			}
		}
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getAdd() + " " + contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t: contato.getTelefones()) {
				System.out.println(t.getAdd() + " " + t.getNumero());
			}
		}
	}
}
