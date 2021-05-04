
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		Integer numeros[] = new Integer[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 10 numeros inteiros");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = sc.nextInt();
		}
		Integer pares[] = new Integer[10];
		Integer impares[] = new Integer[10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			if(numeros[i] % 2 == 0)
				pares[i] = numeros[i];
			else
				impares[i] = numeros [i];
		}
	}
}
