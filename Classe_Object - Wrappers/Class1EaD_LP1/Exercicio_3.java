import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		System.out.println("Digite dois números para saber sua soma, subtração e sua multiplicação.");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		 
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		double soma = num1 + num2;
		
		System.out.println(" A soma dos valores é: " + soma + "." );
		
		double sub = num1 - num2;
		
		System.out.println(" A subtração dos valores é: " + sub + "." );
		
		double multi = num1 * num2;
		
		System.out.println(" A multiplicação dos valores é: " + multi + "." );

	}

}
