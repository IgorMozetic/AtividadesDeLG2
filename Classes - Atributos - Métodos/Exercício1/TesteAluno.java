package Exercício1;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aln = new Aluno();
		
		aln.setNome( "Igu" );
		aln.setIdade( 16 );
		aln.setProntnuário( "SP1234567" );
		
		System.out.println( "Nome: " + aln.getNome() + "\nIdade: " + aln.getIdade() + "\nProntuário: " + aln.getProntuário() );
	}
}
