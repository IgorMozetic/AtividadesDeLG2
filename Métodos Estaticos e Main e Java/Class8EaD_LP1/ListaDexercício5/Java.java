package ListaDexercício5;

public class Java {

		public static Integer max3( Integer n1, Integer n2, Integer n3 )	{
			
			if (( n1 > n2 ) && ( n1 > n3))
				return n1;
			else if (( n2 > n3 ) && (n2 > n3))
				return n2;
			else
				return n3;
		}
	
		public static Double max3( Double n1, Double n2, Double n3 )	{
			
			if (( n1 > n2 ) && ( n1 > n3))
				return n1;
			else if (( n2 > n3 ) && (n2 > n3))
				return n2;
			else
				return n3;
		}
}
