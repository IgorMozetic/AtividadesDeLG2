package ListaDeExercício4_Av2;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println( Calculadora.multiplicar( 3, 7 ) );
		System.out.println( Calculadora.multiplicar( 3.5, 7.0 ) );
		
		System.out.println( Calculadora.cubo( -4 ) );
		System.out.println( Calculadora.parimpar( 52 ) );
		System.out.println( Java.min3( 6.2, 5.3, 10.0 ) );
		
		Tempo num = new Tempo( 12, 42, 600 );
		System.out.println( num.getMinutos() );
		num.setSegundos( 324 );
		System.out.println( num.getSegundos() );
		
		num.imprimir();
		System.out.println( num.horasemsegundos() );
		System.out.println( num.minutosemsegundos() );

	}

}
