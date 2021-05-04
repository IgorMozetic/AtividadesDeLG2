package Codigos;

public class TesteCalculadora {

	public static void main(String[] args) {

		int fatorialNR = FuncoesRecursivas.FatorialNaoRecursivo(5);
		System.out.println("O fatorial não recursivo do número 5 é: " + fatorialNR);
		
		int fatorial = FuncoesRecursivas.Fatorial(5);
		System.out.println("\nO fatorial recursivo do número 5 é: " + fatorial);
	}
}
