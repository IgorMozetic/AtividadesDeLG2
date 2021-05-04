package Atividade1;
import java.util.Scanner;
public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade.");
		
		int idade = sc.nextInt();
		
		if( idade >= 16 )
			System.out.println("Você já pode votar.");
		else
			System.out.println("Você não pode votar.");
	}
}
