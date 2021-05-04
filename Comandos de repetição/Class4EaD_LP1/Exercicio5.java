package Atividade2;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número da tabuada que deseja ver.");
		
		Integer num = sc.nextInt();
		
		System.out.println("A tabuada a seguir é a: " + num );
		
		for( int cont = 0; cont <= 10; cont++)	{
			
			Integer result = num * cont;
			
			System.out.println( + num + " x " + cont + " = " + result );
		}
	}
}
