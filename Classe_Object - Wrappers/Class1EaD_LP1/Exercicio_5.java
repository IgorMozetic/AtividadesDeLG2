import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		System.out.println("Digite o ano de seu nascimetno que diremos quantos anos voce tem.");
		
		Scanner sc = new Scanner(System.in);
		
		Integer nascimento = sc.nextInt();
		Integer ano = 2020;
		Integer idade = ( ano - nascimento );
		
		System.out.println( "A sua idade é: " + idade + "." );
		
	}
}
