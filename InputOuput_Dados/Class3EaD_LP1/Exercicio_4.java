package Atividade1;
import java.util.Scanner;
public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro.");
		
		int num = sc.nextInt();
		
		if ( num % 2 == 0 )	
			System.out.println("O número " + num + " é par.");
		else
			System.out.println("O número " + num + " é impar.");
	}
}
