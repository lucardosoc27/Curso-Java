package cursojava.relacionamento.entre.Praticando;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato ();
		
		contato.setNome("Luã");
		// contato.setEndereco("Alameda dos anjos");
		// contato.setTelefone("71988652185");
		
		Endereco enderecos = new Endereco ();
		
		enderecos.setNomeRua("Rua Game of Throne");
		enderecos.setNumero("N/A");
		enderecos.setComplemento("N/A");
		enderecos.setCidade("Kings Landing");
		enderecos.setEstado("Westeros");
		enderecos.setCep("41254-445");
		
		contato.setEndereco(enderecos);
		
		Telefone tel = new Telefone ();
		
		tel.setTipo("Celular");
		tel.setDdd("71 ");
		tel.setNumero("999999999");
		
		Telefone tel1 = new Telefone ();
		
		tel1.setTipo("Telefone");
		tel1.setDdd("031");
		tel1.setNumero("888888888");
		
		Telefone tel2 = new Telefone ();
		
		tel2.setTipo("Casa");
		tel2.setDdd("98");
		tel2.setNumero("7777777777");
		
		Telefone tel3 = new Telefone ();
		
		tel3.setTipo("Celular");
		tel3.setDdd("55");
		tel3.setNumero("5555555555");
		
		List<Telefone> listaDeTelefones = new ArrayList<>();
		
		listaDeTelefones.add(tel);
		listaDeTelefones.add(tel1);
		listaDeTelefones.add(tel2);
		listaDeTelefones.add(tel3);
		
		contato.setTelefones(listaDeTelefones);
		System.out.println(contato);
		}
	}