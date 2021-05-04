
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner (System.in);
		
		System.out.println("entre com o primeiro numero: ");
				
		int i = a.nextInt();
		
		System.out.println("entre com o segundo numero: ");
	
		int j = a.nextInt();
		
		if ( i > j )
			System.out.println( i + " é maior que " + j);
		else 
			System.out.println( j + " é maior que " + i );
	}

}
