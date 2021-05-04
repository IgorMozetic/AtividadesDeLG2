
import java.util.Scanner;

public class Exercico_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite um número de 0 a 20");
		
		Integer NumExtenso = sc.nextInt();
		
		switch ( NumExtenso )	{
		default: 
				System.out.println("Esse número não está entre 0 e 20!");
		case 0:
				System.out.println("Zero");
				break;
		case 1:
				System.out.println("Um");
				break;
		case 2:
				System.out.println("Dois");
				break;
		case 3:
				System.out.println("Três");
				break;
		case 4:
				System.out.println("Quatro");
				break;
		case 5:
				System.out.println("Cinco");
				break;
		case 6:
				System.out.println("Seis");
				break;
		case 7:
				System.out.println("Sete");
				break;
		case 8:
				System.out.println("Oito");
				break;
		case 9:
				System.out.println("Nove");
				break;
		case 10:
				System.out.println("Dez");
				break;
		case 11:
				System.out.println("Onze");
				break;
		case 12:
				System.out.println("Doze");
				break;
		case 13:
				System.out.println("Treze");
				break;
		case 14:
				System.out.println("Quatorze");
				break;
		case 15:
				System.out.println("Quinze");
				break;
		case 16:
				System.out.println("Dezesseis");
				break;
		case 17:
				System.out.println("Dezessete");
				break;
		case 18:
				System.out.println("Dezoito");
				break;
		case 19:
				System.out.println("Dezenove");
				break;
		case 20:
				System.out.println("Vinte");
				break;
		}	
	}
}
