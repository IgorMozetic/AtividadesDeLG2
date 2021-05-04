
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
	
		System.out.println("entre com um numero maior que zero: ");
		
		Scanner a = new Scanner ( System.in );
		
		int i = a.nextInt();
		
		if( i % 2 == 0)
			System.out.println("esse numero eh par");
		else
			System.out.println("esse numero eh impar");
	}
}
