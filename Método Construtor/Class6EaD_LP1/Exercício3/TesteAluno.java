package Exercício3;

public class TesteAluno {
		
	public static void main(String[] args) {
	
		Aluno a1 = new Aluno();
		
		a1.setNome( "Messi Valverde" );
		a1.setRg( "12345678-9" );
		a1.setProntuário( "SP1234567" );
		
		System.out.println( "Nome: " + a1.getNome() + "\nRG: " + a1.getRg() + "\nProntuário: " + a1.getProntuário() );
		
		Aluno a2 = new Aluno( "Thiago Galhardo", "98765432-1", "SP7654321" );
		
		System.out.println( "\nNome: " + a2.getNome() + "\nRG: " + a2.getRg() + "\nProntuário: " + a2.getProntuário() );
	
	}
}
