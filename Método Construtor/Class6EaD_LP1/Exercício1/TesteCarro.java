package Exercício1;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.setMarca( "BMW" );
		c1.setModelo( "I8" );
		c1.setAnodefabricação( 2020 );
		
		System.out.println( "Marca: " + c1.getMarca() + "\nModelo: " + c1.getModelo() + "\nAno de Fabricação: " + c1.getAnodefabricação() );
	
		Carro c2 = new Carro( "Ferrari", "F8", 2020);
		
		System.out.println( "\nMarca: " + c2.getMarca() + "\nModelo: " + c2.getModelo() + "\nAno de Fabricação: " + c2.getAnodefabricação() );
	}

}
 