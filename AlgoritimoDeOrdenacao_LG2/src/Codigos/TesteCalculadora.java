package Codigos;

public class TesteCalculadora {

	public static void main(String[] args) {

		int fatorialNR = FuncoesRecursivas.FatorialNaoRecursivo(5);
		System.out.println("O fatorial n�o recursivo do n�mero 5 �: " + fatorialNR);
		
		int fatorial = FuncoesRecursivas.Fatorial(5);
		System.out.println("\nO fatorial recursivo do n�mero 5 �: " + fatorial);
	}
}
