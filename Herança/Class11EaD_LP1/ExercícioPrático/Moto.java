package ExercícioPrático;

public class Moto extends Veiculo {
	
	private Integer quantidadeCilindradas;
	
	public Moto()	{
		super();
		this.quantidadeCilindradas = 0;
	}
	
	public Moto( String marca, String modelo, Integer quantidadeCilindradas )	{
		super( marca, modelo );
		this.quantidadeCilindradas = quantidadeCilindradas;
	}

	public Integer getQuantidadeCilindradas() {
		return quantidadeCilindradas;
	}

	public void setQuantidadeCilindradas(Integer quantidadeCilindradas) {
		this.quantidadeCilindradas = quantidadeCilindradas;
	}
	
	public String toString()	{
		return super.toString() + " / Quantidade de Cilindradas: " + quantidadeCilindradas;
	}
}
