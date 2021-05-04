package Atividade1;
import java.util.Scanner;
public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto você pagou no produto? ");
		
		double valor = sc.nextDouble();
		
		if ( valor > 20.0 )	{
			valor = valor*1.45;
			System.out.println("O valor que deve ser vendido é: R$" + valor );
		}
		else	{
			valor = valor*1.30;
			System.out.println("O valor que deve ser vendido é: R$" + valor );
		}
	}
}
