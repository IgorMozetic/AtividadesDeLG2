
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Integer i = new Integer(0);
		
		Integer soma = new Integer(0);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número para ser efetuada a soma:");
		
		i = sc.nextInt();
		
		while(i > 0) {
				
			soma = soma + i;
			
			System.out.println("Entre com um número para ser efetuada a soma:");
			
			i = sc.nextInt();
			
		}
		
		System.out.println("Soma:"+soma);	
		
		}
	}
