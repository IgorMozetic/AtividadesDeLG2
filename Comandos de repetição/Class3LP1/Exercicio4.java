
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Integer i = new Integer(0);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero de 1 até 100:");
		
		i = sc.nextInt();

		do {
			
			if ((i <= 100) && (i >= 1)) {
			
				Integer a = new Integer(1);
				
				while (a <= i) {
				
				System.out.println("*");
				
				a = a + 1;
			}
		}
		
			System.out.println("Entre com um numero de 1 até 100:");
		
			i = sc.nextInt();
		}
			while (i !=0);
			
		}
	}
		


