package ExercícioPrático;

public class Barco extends Veiculo{

	private Integer potenciaMotor;
	
	public Barco()	{
		super();
		this.potenciaMotor = 0;
	}
	
	public Barco( String marca, String modelo, Integer potenciaMotor )	{
		super( marca, modelo );
		this.potenciaMotor = potenciaMotor;
	}

	public Integer getpotenciaMotor() {
		return potenciaMotor;
	}

	public void setpotenciaMotor(Integer potenicaMotor) {
		this.potenciaMotor = potenicaMotor;
	}
	
	public String toString()	{
		return super.toString() + " / Potencia do Motor: " + potenciaMotor;
	}
}
