package cursojava.orientacao.objeto.get.set;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro ();
		Carro van2 = new Carro ();
		
		van.setMarca("Fiat"); // set para atribuir o valor do Fiat para marca depois do encapsulamento
		van.setModelo("Ducato");
		van.setNumPassageiros(15);
		van.setCapCombustivel(150);
		van.setConsumoCombustivel(2.0);
		van.setLitros(60);
		
		van2.setMarca("BMW"); 
		van2.setModelo("XML");
		van2.setNumPassageiros(5);
		van2.setCapCombustivel(350);
		van2.setConsumoCombustivel(3.0);
		van2.setLitros(60);
		
		exibirInformacoes(van, 1);
		exibirInformacoes(van2, 2);
		
	}
		
		public static void exibirInformacoes (Carro carro, int numeroCarro) {
			
		System.out.println("As informacoes do carro " + numeroCarro + " estao sendo processadas...");
		System.out.println("Marca: " + carro.getMarca()); // get para obter o valor
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Número de passageiros: " + carro.getNumPassageiros());
		System.out.println("Capacidade do combustivel: " + carro.getCapCombustivel());
		System.out.println("Consumo de combustivel: " + carro.getConsumoCombustivel());
		System.out.println("Autonomia do carro: " + carro.getAutonomia());
		System.out.println("Litros: " + carro.getLitros());
		System.out.println("---------------------------------");
	}
}
