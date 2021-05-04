
import java.util.Scanner; 

public class Exercicio_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número que você deseja ver a tabuada");
		
		Integer a = sc.nextInt();
		
		for( int i = 0; i <= 10; i++)	{
			
			Integer result = a * i;
			
			System.out.println(+a +"x" +i +"=" +result);
		}
	}
}
