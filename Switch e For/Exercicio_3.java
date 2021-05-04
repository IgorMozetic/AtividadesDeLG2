
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com un Número referente aos dias da semana: ");
		
		int DiasDaSemana = sc.nextInt();
		
		switch ( DiasDaSemana ) {
		default :
				System.out.println("Este é um dia inválido!");
				break;
		case 1: 
				System.out.println("Domingo, fim de semana");
				break;
		case 2:
				System.out.println("Segunda-feira, dia útil");
				break;
		case 3:
				System.out.println("Terça-feira, dia útil");
				break;
		case 4:
				System.out.println("Quarta-feira, dia útil");
				break;
		case 5:
				System.out.println("Quinta-feira, dia útil");
				break;
		case 6:
				System.out.println("Sexta-feira, dia útil");
				break;
		case 7:
				System.out.println("Sábado, fim de semana");
				break;
		}
		
	}

}
