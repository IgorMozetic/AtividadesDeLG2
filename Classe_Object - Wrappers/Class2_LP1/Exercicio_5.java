
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		System.out.println("Entre com três números:");
		
		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);
		
		Scanner sc3 = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		double b = sc.nextDouble();
		
		double c = sc.nextDouble();
		
		if ( a < b && b < c )
			
			System.out.println("A ordem crescente é :" + a + ", " + b + ", " + c );
		
		else
		
			if ( a < c && c < b)
			
			System.out.println("A ordem crescente é: " + a + ", " + c + ", " + b );
		
		else
		
			if ( b < a && a < c )
			
			System.out.println("A ordem crescente é: " + b + ", " + a + ", " + c );
		
		else
					
			if ( b < c && c < a )
						
			System.out.println("A ordem crescente é: " + b + ", " + c + ", " + a );
				
		else
			
			if ( c < a && a < b)
				
				System.out.println("A ordem crescente é: " + c + ", " + a + ", " + b );
			
		else
			
			if ( c < b && b < a )
				
				System.out.println("A ordem crescente é: " + c + ", " + b + ", " + a );
	}

}
