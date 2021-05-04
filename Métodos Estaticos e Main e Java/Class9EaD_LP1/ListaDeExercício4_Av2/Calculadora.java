package ListaDeExercício4_Av2;

public class Calculadora {

	public static Integer multiplicar( Integer n1, Integer n2 )	{
		return n1 * n2;
	}
	
	public static Double multiplicar( Double n1, Double n2 )	{
		return n1 * n2;
	}
	
	public static Integer cubo( Integer n )	{
		return n * n * n;
	}
	
	public static Integer parimpar( Integer n )	{
		
		if( n.equals(0) )
			System.out.println( "zero" );
		else if( n % 2 == 0)	
			System.out.println( "par" );
		else
			System.out.println( "impar" );
	
		return n;
	}
}