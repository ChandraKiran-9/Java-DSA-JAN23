package Chapter01_Java_Basics_1;

public class Operators_03L 
{
	public static void main(String[] args) 
	{
		/*
		 * Operators :
		 * 1. Arithmetic Operators :
		 * 				+ , - , * , / , %(modulo-for remainder)  
		 * 2. Assignment Operators :
		 * 				= , += , -= , *= , /= , .....
		 * 3. Relational Operators :
		 * 				> , >= , < , <= , == , != .....
		 * 4. Logical Operators : 
		 * 				&& , || , !
		 * 5. Bitwise Operators :
		 * 				& , | , << , >>
		 * 6. Uniary Operator :
		 * 				++ , --
		 */
		
		int a = 12 ;
		int b = 36 ;
		
		// Arithmetic Operations
		
		System.out.println("Addition : " + (a+b));
		System.out.println("Subtraction : " + (a-b));
		System.out.println("Multiplication : " + (a*b));
		System.out.println("Division : " + (a/b));
		System.out.println("Modulo : " + (a%b));
		
		System.out.println(12/2);
		System.out.println(12%2);
		
		System.out.println(12/5);
		System.out.println(12%5);
		
		System.out.println(12/2.0);
		System.out.println(12.0/2);
		System.out.println(12.0%2);
		System.out.println(12%2.0);
		
		System.out.println("-------------------------");
		
		// Assignment operations
		
		int aa = 25 ;
		System.out.println(aa);
		
		aa += 20 ;   // a+=b -> a = a+b
		System.out.println(aa);
		
		aa -= 10 ;   // a-=b -> a = a-b
		System.out.println(aa);
		
		aa *= 2 ;    // a*=b -> a = a*b
		System.out.println(aa);
		
		aa /= 10 ;    // a/=b -> a = a/b
		System.out.println(aa);
		
		aa %= 4 ;     // a%=b -> a = a%b
		System.out.println(aa);
		
		System.out.println("-------------------------");
		
		// Relational Operator : "provides a boolean o/p"
		
		int c = 20 ;
		int d = 24 ;
		int e = 20 ;
		
		System.out.println(c>d);	// false
		System.out.println(c<d);	// true
		System.out.println(c<=e);	// true
		System.out.println(c>=e);	// true
		System.out.println(c==e);	// true
		System.out.println(c!=e);	// false
		System.out.println(c!=d);	// true
		
		System.out.println("-------------------------");
		
		// Uniary Operator : ++ , --
		
		int a1 = 5 ;
		System.out.println(a1); // 5
		
		System.out.println(a1 ++);  // 5
		System.out.println(a1);		// 6
		
		System.out.println(++ a1);	// 7
		System.out.println(a1);		// 7
		
		System.out.println(a1 --);	// 7
		System.out.println(a1);		// 6
		
		System.out.println(-- a1);	// 5
		System.out.println(a1);		// 5
		
		System.out.println("-------------------------");
		
		// Bitwise operator : & , | , << , >>
		
		a1 = 10 ;
		int b1 = 5 ;
		
		System.out.println(a1&b1);
		System.out.println(a1|b1);
		System.out.println(a1^b1);
		System.out.println(10^15);
		System.out.println(10<<2);
		System.out.println(10>>2);
		
		System.out.println("----------END------------");
		
	}

}
