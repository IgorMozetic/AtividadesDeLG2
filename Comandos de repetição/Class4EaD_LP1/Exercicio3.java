package Atividade2;

public class Exercicio3 {

	public static void main(String[] args) {
		
		System.out.println("Os números pares de 1 a 200 são");
		
		for( int num = 1; num <= 200; num++)	{
			
			if ( num % 2 == 0)
				System.out.print(num + ", ");
		}
	}
}
