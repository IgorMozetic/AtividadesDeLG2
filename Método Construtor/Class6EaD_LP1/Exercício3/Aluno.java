package Exercício3;

public class Aluno {

	private String nome;
	private String rg;
	private String prontuário;
	
	public Aluno()	{
		
		this.nome = "";
		this.rg = "";
		this.prontuário = "";
	}

	public Aluno( String nome, String rg, String prontuário )	{
		
		this.nome = nome;
		this.rg = rg;
		this.prontuário = prontuário;
	}

	public String getNome()	{
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getProntuário() {
		return prontuário;
	}

	public void setProntuário(String prontuário) {
		this.prontuário = prontuário;
	}
	
	
}
