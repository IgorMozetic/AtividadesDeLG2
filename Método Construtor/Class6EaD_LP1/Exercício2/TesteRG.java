package Exercício2;

public class TesteRG {

	public static void main(String[] args) {
		
		RG r1 = new RG();
		
		r1.setNome( "Neymar Junior" );
		r1.setDataemissão( "01/01/2020" );
		r1.setNúmero( "12345678-9" );
		
		System.out.println( "Nome: " + r1.getNome() + "\nData de emisão: " + r1.getDataemissão() + "\nNúmero: " + r1.getNúmero() );
		
		RG r2 = new RG( "Arlindo Souza", "01/01/2019", "98765432-1" );
		
		System.out.println( "\nNome: " + r2.getNome() + "\nData de emisão: " + r2.getDataemissão() + "\nNúmero: " + r2.getNúmero() );
		
		

	}

	
	
}
