package Exercício3;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		p1.setNome( "Igu" );
		p1.setCpf( "123456789-10" );
		p1.setIdade( 16 );
		
		System.out.println( "Nome: " + p1.getNome()  + "\nCPF: " + p1.getCpf()  + "\nIdade: " + p1.getIdade() );

	}

}
