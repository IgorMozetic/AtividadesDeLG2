package atividade1;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Integer numero;
		Integer menor = 0;
		Integer maior = 0;
		
		
		System.out.println("Entre somente com números positivos e para finalizar digite o número 0");

		do {

			numero = sc.nextInt();
			if( numero > 0 )	{
				if (numeros.size() == 0 )	{
					maior = numero;
					menor = numero;
				} if ( maior < numero )	{
					 maior=numero;	
				} else if ( menor > numero )	{
					menor = numero;
				}
				numeros.add( numero );
			} else if ( numero < 0 ){
				System.out.println( "Por favor, entre com um número válido!" );
			}
		} while( numero != 0 );
		
		System.out.println("\nA quantidade ded números armazenadas é " + numeros.size() + "\nO menor número é: "+ menor + "\nO maior número �: " + maior);
	}
}