package Exercícios;

import java.util.LinkedList;

public class Exercício3 {

	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		Integer soma = 0;
		
		lista.add(2);
		lista.add(4);
		lista.add(6);
		lista.add(8);
		
		System.out.println( "Os elementos presentes na lista são: " + lista );
		
		for( int contador = 0; contador < lista.size() ; contador++ )	{			
			soma = soma + lista.get( contador );
		}
		System.out.println( "A soma dos elementos da lista é: " + soma );
	}
}
