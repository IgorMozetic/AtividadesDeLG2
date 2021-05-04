package Atividade2;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer resp = 0;
		
		int i = 0;
		
		double total = 0;
		
		do	{
			
			System.out.print("Entre com número inteiro para saber a média dele e 0 para parar: ");
			
			resp = sc.nextInt();
			
			i = i + 1;
			
			total = total + resp;
			
		}
		while ( resp != 0 );
		
		i = i - 1;
		
		total = total/i;
		
		System.out.println("A média dos números inteiros digitados é: " + total );
		System.out.println("A quantidade de números digitalizados foi: " + i );
	}
}
