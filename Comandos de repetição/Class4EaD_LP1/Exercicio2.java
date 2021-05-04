package Atividade2;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {

		int i = 0;
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Entre com dois números inteiros, o primeiro menor que o segundo");
		
		int resp1 = sc.nextInt();
		int resp2 = sc1.nextInt();
		
		if ( resp1 < resp2 )	{
			
			System.out.println("A contagem dos números é: ");
			
			while ( resp1 <= resp2 )	{
				
				System.out.println(resp1);
				
				resp1 = resp1 + 1;
			}
		}
	}
}