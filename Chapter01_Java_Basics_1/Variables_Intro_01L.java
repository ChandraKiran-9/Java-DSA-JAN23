package Chapter01_Java_Basics_1;

public class Variables_Intro_01L 
{
	public static void main(String[] args) 
	{
		// Variables : name of the memory location where we store the data. 
		/*
		 * Rules for naming variables :
		 * 1. Java is a case sensitive language.
		 * 		Example: age = 10 ; Age = 10 ; // here both are not same 
		 * 2. Variable name should start with a letter / underscore(_) / dollar($) sign .
		 * 3. It should start with a digit .
		 * 4. No other special characters can be used in b/w including space
		 * 
		 */
		
		// Data Types : type of data that we want to store in the memory. 
		/*
		 * 8 primitive data types.
		 * 
		 * 1. byte - 1byte
		 * 2. short - 2bytes  
		 * 3. int - 4bytes
		 * 4. long - 8bytes
		 * 5. float - 4bytes
		 * 6. double - 8bytes
		 * 7. char - 2bytes  (for all the characters on the keyboard) 
		 * 8. boolean - 1bit (t/f) 
		 * 
		 */
		
		int age = 34 ; // declared & initialized
		/*
		 * variable -> age ;
		 * data type -> int ;
		 * value -> 34 ;
		 * = -> assignment operator used to assign the value to the variable . 
		 */
		
		int a ;   // declared
		a = 34 ;  // initialized
		
		System.out.println("a : " + a);
		a = 25 ;  // a value changes
		System.out.println("a updated : " + a);
		
		byte by = 56 ;
		System.out.println("byte : " + by);
		
		float pi = 3.14f ;
		System.out.println("float value : " + pi);
		
		double d = 10.4567 ;
		System.out.println("double value : " + d);
		
		boolean b = true ;
		System.out.println("boolean value : " + b);
		b = false ;
		System.out.println("boolean value : " + b);
		
		char c = '#';
		System.out.println("character : " + c);
		c = 'a' ;
		System.out.println("character : " + c);
		c = '/' ;
		System.out.println("character : " + c);
		
		System.out.println("-------------------------------");
		
		byte a1 = 100 ;
		System.out.println("byte : " + a1);
		a1 = 124 ;
		System.out.println("byte updated : " + a1);
		
		
		short a2 = 2313 ;
		System.out.println("short : " + a2);
		a2 = 3000 ;
		System.out.println("short updated : " + a2);
		
		
		int a3 = 345788 ;
		System.out.println("int : " + a3);
		
		long a4 = 1234567890 ;
		System.out.println("long : " + a4);
		
		/*
		 * float & double :
		 * 					by default 3.4564 is considered as double value , if we want to give float value
		 * then we have to use f/F after the value like 3.4564f now this value is a float value .
		 */
		float f1 = 3.145467f;
		System.out.println("float : " + f1);
		
		double d1 = 3.14546117181 ;
		System.out.println("double : " + d1);
		
		char c1 = '9';
		System.out.println("character : " + c1);
		c1 = '.';
		System.out.println("character : " + c1);
		c1 = '&' ;
		System.out.println("character : " + c1);
		
		boolean b1 = true ;
		System.out.println("boolean value : " + b1);
		b1 = false ;
		System.out.println("boolean value : " + b1);
		// b1 = 0 ; --> error because b1 is a boolean value which will take only true/false value .
		
		
		
	}
}
 