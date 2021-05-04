
import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Double vetorNota[] = new Double[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com 10 notas de uma turma");
		
		for(int a = 0; a < vetorNota.length; a++) {
			vetorNota[a] = sc.nextDouble();
		}
		
		Double soma = 0.0;
		Double maior = 0.0;
		Double menor = 10.0;
		
		for( int i = 0 ; i < vetorNota.length ; i++ ) {
			soma = (soma + vetorNota[i]);
			if( vetorNota[i] > maior )
				maior = vetorNota[i];
			if( vetorNota[i] < menor )
				menor = vetorNota[i];
		}
		soma = soma / 10;
		
		System.out.println("A média é: " +soma);
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
		
		
	}
}
