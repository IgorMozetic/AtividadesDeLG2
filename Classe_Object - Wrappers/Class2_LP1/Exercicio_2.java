
public class Exercicio_2 {

	public static void main(String[] args) {
		
		Integer a = new Integer(1);
		
		Double b = new Double(2);
		
		int c = 0;
		
		double d = 0;
		
		c = a.intValue();
		
		d = b.doubleValue();
		
		System.out.println("OS valores são: " + c + ", " + d + ", " + a.equals(b));
		
		Integer e = Integer.valueOf(c);
		
		Integer f = Integer.parseInt("3");
		
		Double g = Double.parseDouble("4");
		
		String h = "5";
		
		String i = h.toString();

		System.out.println("OS valores são: " + e + ", " + f + ", " + g +", " + i);
	}

}
