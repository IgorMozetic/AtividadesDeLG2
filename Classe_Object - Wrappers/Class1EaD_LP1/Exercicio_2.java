
public class Exercicio_2 {

	public static void main(String[] args) {
		
		Integer a = 1;
		Double b = 2.0;
		
		int c = a.intValue();
		double d = b.doubleValue();
		
		System.out.println("intValue e doubleValue: " + c +", " + d + "." );
		
		String e = "3";
		int f = Integer.parseInt(e);
		
		String g = "4.0";
		double h = Double.parseDouble(g);
		
		System.out.println("parseInt e parseDouble: " + f + ", " + h + "." );
		
		int i = 5;
		Integer j = Integer.valueOf(i);
		
		System.out.println("valueOf: " + j + "." );
		
		}

}
