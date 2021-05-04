package Exercício1;

public class Carro {

	private String marca;
	private String modelo;
	private Integer anodefabricação;
	
	public Carro()	{
		
		this.marca = "";
		this.modelo = "";
		this.anodefabricação = 0;
	}
	
	public Carro( String marca, String modelo, Integer anodefabricação )	{
		
		this.marca = marca;
		this.modelo = modelo;
		this.anodefabricação = anodefabricação;
	}
	
	public String getMarca()	{
		return marca;
	}
	
	public void setMarca( String marca )	{
		this.marca = marca;
	}
	
	public String getModelo()	{
		return modelo;
	}
	
	public void setModelo( String modelo )	{
		this.modelo = modelo;
	}
	
	public Integer getAnodefabricação()	{
		return anodefabricação;
	}
	
	public void setAnodefabricação( Integer anodefabricação )	{
		this.anodefabricação = anodefabricação;
	}
}