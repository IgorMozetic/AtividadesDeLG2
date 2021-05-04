
import java.util.Scanner;

public class Exercico_4 {

	public static void main(String[] args) {
	
		System.out.println("Digite o ano do seu nascimento: ");
		
		Scanner a = new Scanner ( System.in );
		
		int i = a.nextInt();
		
		int j = 2020 - i;
		
		System.out.println("Sua idade eh: " + j );
	}

}
