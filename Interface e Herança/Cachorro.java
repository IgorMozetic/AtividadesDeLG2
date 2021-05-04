package Atividade6;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements Animal 	{

	private String cor;
	
	public Cachorro()	{
		super();
		this.cor = "";
	}
	
	public Cachorro( String nome, LocalDate nascimento, String cor )	{
		super( nome, nascimento);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String especie()	{
		return "Chitzu";
	}
		
	public String somAnimal()	{
		return "auauau";
	}
			
	public Integer idade()	{
		int nasc = LocalDate.now().compareTo(this.getNascimento());
		return nasc;
	}
	
	public String toString() {
		return super.toString() +"\nCor: " + cor + "\nEspecie: " + especie() + "\nSomAnimal: " + somAnimal() + "\nIdade: " + idade();
	}
}
