
public class Exercicio2 {

	public static void main(String[] args) {
		
		Integer i =  new Integer(0);
		
		Integer soma = new Integer(0);
		
		while (i <= 1000) {
			
			soma = i + soma; 
			
			i = i + 1;
			
		}
		
		System.out.println("O valor da soma de 1 até 1000 é:" +soma);
	}

}
