package Atividade6;

import java.time.LocalDate;

public class teste {

	public static void main(String[] args) {
		
		Mamifero m1 = new Mamifero();
		m1.setNome("tirulipa");
		m1.setNascimento(LocalDate.of(2020, 2, 20));
		
		System.out.println(m1.toString());
		
		Cachorro c1 = new Cachorro();
		c1.setNome("tacarica");
		c1.setNascimento(LocalDate.of(2015, 3, 20));
		c1.setCor("azul");
		c1.especie();
		c1.idade();
		c1.somAnimal();
		
		System.out.println(c1.toString());
		
		Gato g1 = new Gato();
		g1.setNome("tururu");
		g1.setNascimento(LocalDate.of(2017, 4, 20));
		g1.setPelagem("peludao");
		g1.especie();
		g1.idade();
		g1.somAnimal();
		
		System.out.println(g1.toString());
	}
}
