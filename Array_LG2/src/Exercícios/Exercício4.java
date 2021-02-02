package Exercícios;

public class Exercício4 {

	public static void main(String[] args) {
		
		Integer array1[][] = new Integer[50][100];
		
		for ( int cont1 = 49; cont1 >= 0; cont1-- )	{
            for ( int cont2 = 99; cont2 >= 0; cont2-- )	{
  			   array1[cont1][cont2] = cont1 + cont2; 
	        }   
        }
		
		System.out.println("Os valores da soma dos indices são: " );
		
		for ( int cont1 = 49; cont1 >= 0; cont1-- )	{
            for ( int cont2 = 99; cont2 >= 0; cont2-- )	{
            	System.out.println(array1[cont1][cont2]);
            }
		}
	}
}