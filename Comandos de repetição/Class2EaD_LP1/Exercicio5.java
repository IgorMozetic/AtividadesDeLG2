package Lista2;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Integer numero = new Integer(0);
		
		Integer soma = new Integer(0);
		
		Scanner sc = new Scanner( System.in );
		
		System.out.print("Entre com um número positivo e sua soma será efetuada e um número negativo para sair: ");
			
		numero = sc.nextInt();
		
		while ( numero >= 0 ) {
			
			soma = soma + numero;
			
			System.out.print("Entre com um número positivo e sua soma será efetuada e um número negativo para sair:");
			
			numero = sc.nextInt();
			
		}
		System.out.print("A soma dos números positivos é: " + soma );
	}

}
