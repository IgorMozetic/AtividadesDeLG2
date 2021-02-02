package Exercícios;

public class Exercício2 {

	public static void main(String[] args) {

		Integer array1[] = new Integer[10];

		for ( int contador = 9; contador >= 0; contador-- )	{
			array1[contador] = contador;
		}
		
		System.out.println("Os elementos do array são: ");
		
		for (int contador = 9; contador >= 0 ; contador-- )	{
			System.out.println( array1[contador] );
		}
	}
}