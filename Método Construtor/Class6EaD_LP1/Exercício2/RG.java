package Exercício2;

public class RG {

	private String nome;
	private String dataemissão;
	private String número;
	
	public RG()	{
		
		this.nome = "";
		this.dataemissão = "";
		this.número = "";
	
	}
	
	public RG( String nome, String dataemissão, String número )	{
		
		this.nome = nome;
		this.dataemissão = dataemissão;
		this.número = número;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataemissão() {
		return dataemissão;
	}

	public void setDataemissão(String dataemissão) {
		this.dataemissão = dataemissão;
	}

	public String getNúmero() {
		return número;
	}

	public void setNúmero(String número) {
		this.número = número;
	}
}
