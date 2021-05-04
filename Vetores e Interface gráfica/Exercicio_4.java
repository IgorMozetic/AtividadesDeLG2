package teste;

import java.util.Scanner;

public class Exercicio4_LG2 {

	public static void main(String[] args) {

		Integer numeros[] = new Integer[5];
		Integer a = new Integer (0);
		Integer j = new Integer (0);
		Integer g = new Integer (1);

		Scanner ja = new Scanner (System.in);

		System.out.println("Entre com 5 numeros: ");
		
		for ( a=0; a<5; a++ ) {

		numeros[a] = ja.nextInt();

		j = numeros[a] + j;

		g = numeros[a] * g;


		}

		System.out.println("Soma: " + j);
		System.out.println("multiplicação: " + g);

		}
	}
