package Chapter01_Java_Basics_1;

public class TypeCasting_02L 
{

	public static void main(String[] args)
	{
		byte b = 57 ;
		short s = 3145 ;
		int i = 34567 ;
		long l = 341256789 ;
		char c = 'A' ;
		float f = 31.45f ;
		double d = 3456.123456789 ;
		
		/* Implicit TypeCasting : 
		 * 
		 * byte -> short , int , long , float , double 
		 * short -> int , long , float , double
		 * char -> int , long , float , double 
		 * int -> long , float , double
		 * long -> float , double
		 * float -> double
		 * 
		 * Explicit TypeCasting :
		 * 	any of the above in reverse way .
		 */
		
		// Implicit type casting implementation
		s = b ;
		i = b ;
		l = b ;
		f = b ;
		d = b ;
		
		i = s ;
		l = s ;
		f = s ;
		d = s ;
		
		i = c ;
		l = c ;
		f = c ;
		d = c ;
		
		l = i ;
		f = i ;
		d = i ;
		
		f = l ;
		d = l ;
		
		d = f ;
		
		// Explicit type casting implementation
		b = (byte)s ;
		b = (byte)i ;
		b = (byte)l ;
		b = (byte)f ;
		b = (byte)d ;
		
		s = (short)i ;
		s = (short)l ;
		s = (short)f ;
		s = (short)d ;
		
		c = (char)i ;
		c = (char)l ;
		c = (char)f ;
		c = (char)d ;
		
		i = (int)l ;
		i = (int)f ;
		i = (int)d ;
		
		l = (long)f ;
		l = (long)d ;
		
		f = (float)d ;
		
		
		System.out.println("TypeCasting completed");
		
	}

}
