
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palavras[] = new String[10];
		
		Integer consoantes = new Integer(0);
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.println("Entre com a letra:" );
			palavras[i] = sc.nextLine();		
		}
		
		for (int i = 0; i < palavras.length; i++) {
			
			String valor = palavras[i];
			
			if( valor.equals("a") || valor.equals("e") || valor.equals("i") || valor.equals("o") || valor.equals("u") )
				consoantes = consoantes + 0;
			else
				consoantes = consoantes + 1;
		}
		
		System.out.println("Total de consoantes: " + consoantes );
		
		
	}
}
