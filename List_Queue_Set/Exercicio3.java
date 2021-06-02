package atividade1;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		Integer idade;
		Integer numero;
		String nome;
		
		System.out.println( "Entre com os dados dos jogadores, para finalizar digite o número 0" );

		do {
			
			System.out.println( "\nNovo Jogador" );	
			System.out.print("Nome: ");
			nome = sc.nextLine();
			if(nome.equals("0")) {
				break;
			}
			
			System.out.print( "Idade: " );
			do {

				idade = sc.nextInt();
				if( idade < 0 ) {
					System.out.println( "Por favor, entre com uma idade válida!" );
				}
			}
			while( idade < 0 );
			
			if( idade == 0 ) {
				break;
			}
			
			System.out.print("Número: ");
			do {

				numero=sc.nextInt();
				if(numero<0) {
					System.out.println( "Por favor, entre com um número válido!" );
				}
			}
			while( numero < 0 );

			if( numero == 0 ) {
				break;
			}
			
			sc.nextLine();
			Jogador jogador = new Jogador(nome, idade, numero);
			jogadores.add(jogador);
			
		}while(true);

		
		System.out.println("\nOs jogadores registrados são:");
		for(Jogador i: jogadores) {
			System.out.println("\n"+i);
		}
	}
}
