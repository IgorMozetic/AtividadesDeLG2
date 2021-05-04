package Lista2;
public class Exercicio2 {

	public static void main(String[] args) {
		
		Integer total = new Integer(0);
		
		for ( int cont = 1; cont <= 1000; cont++) {
			total = total + cont;
		}
		System.out.println("O valor da soma dos números de 1 até 1000 é: " + total);
	}
}
