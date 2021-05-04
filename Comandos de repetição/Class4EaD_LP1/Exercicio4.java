package Atividade2;
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Double maior = 0.0;
		
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Escreva 10 números e saiba o maior deles");

		while( cont < 10 )	{
			
			Double resp = sc.nextDouble();

			if( resp > maior )	{
				maior = resp;
			}
			cont++;
		}
		System.out.println("O maior numero é: " + maior);
	}
}