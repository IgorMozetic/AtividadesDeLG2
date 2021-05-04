package Exercício1;

public class Aluno {
	
	private String nome;
	private Integer idade;
	private String prontuário;
	
	public void setNome ( String nome )	{
		this.nome = nome;
	}
	
	public String getNome()	{
		return nome;
	}
	
	public void setIdade ( Integer idade )	{
		this.idade = idade;
	}
	
	public Integer getIdade ()	{
		return idade;
	}
	
	public void setProntnuário ( String prontuário )	{
		this.prontuário = prontuário;
	}

	public String getProntuário ()	{
		return prontuário;
	}	
}
