import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		System.out.println("Entre com as 4 notas.");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		Scanner sc4 = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();
		
		double media = (( nota1 + nota2 + nota3 + nota4 )/4);
		
		if ( media > 6.0 )
			System.out.println("O aluno foi aprovado com : " + media + ".");
		else if ( media >= 4.0 && media <= 6.0)
			System.out.println("O aluno ficará de recuperção, pois tem "+ media + " de media.");
		else 
			System.out.println("O aluno está reprovado, pois tem "+ media + " de media.");
	}

}
