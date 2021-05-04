import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		System.out.println("Entre com a nota do aluno do primeiro trimestre:");
		
		Scanner sc = new  Scanner(System.in);
		
		float nota1 = sc.nextFloat();
		
		System.out.println("Entre com a nota do aluno do segundo trimestre:");
		
		Scanner sc2 = new  Scanner(System.in);
		
		float nota2 = sc2.nextFloat();
		System.out.println("Entre com a nota do aluno do terceiro trimestre:");
		
		Scanner sc3 = new  Scanner(System.in);
		
		float nota3 = sc3.nextFloat();
		
		float media = (nota1 + nota2 + nota3)/3;
		
		if ( media >= 7.0)
			
			System.out.println("Aprovado!");
		
		else 
			
			if ( media >= 5.0 && media <= 7.0 )
			
				System.out.println("Recuperação!");
		
			else
				
				System.out.println("Reprovado!");		
		
	}

}