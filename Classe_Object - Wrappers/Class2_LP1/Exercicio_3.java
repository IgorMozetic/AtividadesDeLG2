
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		System.out.println("Entre com dois números: ");
		
		Scanner sc = new Scanner(System.in);
		
		Scanner sc2 = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc2.nextDouble();
		
		double soma = a + b;
		
		System.out.println(" A soma dos valores é: " + soma);
		
		double sub = a - b;
		
		System.out.println(" A subtração dos valores é: " + sub);
		
		double multi = a * b;
		
		System.out.println(" A multiplicação dos valores é: " + multi);


	}

}
