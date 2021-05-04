package Lista2;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print("Entre com um número inteiro de 0 a 100: ");
		
		Integer numero = sc.nextInt();
			
			do  {
				
				if (( numero > 0) && ( numero <= 100)) {
					
					Integer cont =  new Integer(0);
					
					while ( cont < numero ) {
						System.out.print("*");
				
						cont = cont + 1;
				}
			}
			System.out.print("\nEntre com um número inteiro de 0 a 100: ");
				
			numero = sc.nextInt();
		}
		while ( numero !=0 );
	}

}
