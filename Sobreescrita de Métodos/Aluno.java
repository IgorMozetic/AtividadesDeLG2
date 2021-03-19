package ListaDeExercícios6;

public class Aluno {
	
	private String nome;
	private String curso;
		
	public Aluno()	{
		this.nome = "";
		this.curso = "";
	}
	
	public Aluno( String nome, String curso ) 	{
		this.nome = nome;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso( String curso ) {
		this.curso = curso;
	}
	
	public String toString()	{
		return "Aluno: nome = " + nome + " Curso = " + curso; 
	}
}
