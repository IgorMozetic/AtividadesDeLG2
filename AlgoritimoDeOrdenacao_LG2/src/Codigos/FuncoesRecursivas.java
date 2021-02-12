package Codigos;

public class FuncoesRecursivas {
		
	public static int FatorialNaoRecursivo( int num )	{
			
		if( num == 0 )	{
			return 1;
		}
			
		int total = 1;
		for( int i = num; i > 1; i --)	{
			total *= i;
		}
		
		return total;
	}
		
	public static int Fatorial( int num )	{
			 
		if ( num == 0)	{
			return 1;
		}
			
		return num *= Fatorial( num-1 );
	}
}
