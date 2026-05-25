package Exer03FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		AnimalFactory fabricaAnimal = new AnimalComumFactory();
		AnimalFactory fabricaMamifero = new MamiferoFactory();
		AnimalFactory fabricaPeixe = new PeixeFactory();
		
		List<Animal> animais = new ArrayList<>();
		
		animais.add(fabricaAnimal.criar("Camelo", 150, 2.0, "Amarelo", "Terra", ""));
		animais.add(fabricaMamifero.criar("Urso do Canada", 180, 0.5, "Vermelho", "", "Mel"));
		animais.add(fabricaPeixe.criar("Tubarão", 300, 1.5, "", "", ""));
		
		System.out.println("-----------------------");
		
		for (Animal a : animais) {
			System.out.println(a.toString());
			System.out.println("-----------------------");
		}
	}
}
