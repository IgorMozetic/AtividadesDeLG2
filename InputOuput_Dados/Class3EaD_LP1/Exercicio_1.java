package Atividade1;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha para seu acesso ser permitido.");
		
		int resposta = sc.nextInt();
		
		if ( resposta == 1234 )	{
			System.out.println("Acesso Permitido"); 
		}
		else
			System.out.println("Acesso Negado");
	}
}