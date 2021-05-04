package ListaDeExercícios6;

public class Livro {

	private String nome;
	private String autor;
	private String edição;
	
	public Livro()	{
		this.nome = "";
		this.autor = "";
		this.edição = "";
	}
	
	public Livro( String nome, String autor, String edição )	{
		this.nome = nome;
		this.autor = autor;
		this.edição = edição;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEdição() {
		return edição;
	}

	public void setEdição(String edição) {
		this.edição = edição;
	}
	
	public String toString()	{
		return "Livro: nome = " + nome + " Autor = " + autor + " Edição = " + edição;
	}
}
