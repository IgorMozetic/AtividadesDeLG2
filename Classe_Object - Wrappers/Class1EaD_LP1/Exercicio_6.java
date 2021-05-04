import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		System.out.println("Entre com dois número. ");
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		if ( num1 > num2 )
			System.out.println("O numero menor é o : " + num2 + "." );
		else 
			System.out.println("o numero menor é o : " + num1 + "." );

	}

}
