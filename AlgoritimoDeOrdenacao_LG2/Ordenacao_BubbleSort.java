package Codigos;

public class Ordenacao_BubbleSort {

	public static void main(String[] args) {

		Integer vetor[] = { 3, 6, 2, 1, 8, 4 };
		Integer aux;
		Boolean controle;
		
		for( int i = 0; i < vetor.length; ++i)	{
			controle = true;
			for( int j = 0; j < ( vetor.length - 1 ); ++j)	{
				
				if ( vetor[j] > vetor[j + 1])	{
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
			}
			if(controle)	{
				break;
			}
		}
		System.out.print("O vetor de forma ordenada crescente por BubbleSort é: ");
		for( int i = 0; i < vetor.length; ++i)	{
			System.out.print(vetor[i] + ", ");
		}
	}
}
