package Atividade6;

import java.time.LocalDate;

public class Gato extends Mamifero implements Animal{

	private String pelagem;
	
	public Gato()	{
		super();
		this.pelagem = "";
	}
	
	public Gato( String nome, LocalDate nascimento, String pelagem )	{
		super( nome, nascimento);
		this.pelagem = pelagem;
	}

	public String getPelagem() {
		return pelagem;
	}

	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	
	public String especie()	{
		return "Gato-de-bengala";
	}
		
	public String somAnimal()	{
		return "miauu";
	}
			
	public Integer idade()	{
		int nasc = LocalDate.now().compareTo(this.getNascimento());
		return nasc;
	}
	
	public String toString() {
		return super.toString() +"\nPelagem: " + pelagem + "\nEspecie: " + especie() + "\nSomAnimal: " + somAnimal() + "\nIdade: " + idade();
	}
}
