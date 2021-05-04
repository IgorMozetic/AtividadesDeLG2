package Exercício2;

public class TesteRG {

	public static void main(String[] args) {
		
		RG rg1 = new RG();
		
		rg1.setNome("Igu");
		rg1.setDataemissão("10/10/2010");
		rg1.setNúmero("12345678-9");
		
		System.out.println( "Nome: " + rg1.getNome() + "\nData de Emissão: " + rg1.getDataemissão() + "\nNúmero: " + rg1.getNúmero() );
	}
}
