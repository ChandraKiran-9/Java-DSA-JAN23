package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * loops : used when the work is repetitive .
 * 	1. for loop
 *  2. while loop
 *  3. do-while loop
 * 
 */

public class Loops_Intro_01L
{
	public static void main(String[] args) 
	{
		// Print your name 5 times
		System.out.println("chandu");
		System.out.println("chandu");
		System.out.println("chandu");
		System.out.println("chandu");
		System.out.println("chandu");
		
		/*
		 * here its difficult to print a single statement n times.
		 * here we use loops when the work is repetitive .
		 */
		System.out.println("---------------------");
		
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println("chandu"); // statement
		}
		
		/*
		 * for loop : is used when we know how many no. of times
		 * 				  a work should be done.
		 * 
		 * int i=1 -> a. initialization
		 * i<=5    -> b. condition
		 * i++     -> c. increment/decrement
		 *         -> d . statement/work
		 * 
		 * if the condition is true then only work is done else 
		 * 			loop terminates(stops). 
		 * 
		 * flow : a
		 * 		  b , d , c | b , d , c | b , d , c | .......
		 */
		
		/*
		 * Note : if any of the a,b,c is missing then it leads 
		 * 		  to an infinite loop.
		 */
		
		System.out.println("---------------------");
		
		// print even numbers from 1 - 100
		for(int i=1 ; i<=100 ; i++)
		{
			if(i%2 == 0)
				System.out.println(i);
		}
		
		System.out.println("---------------------");
		
		/*
		 * nested for loop : loop inside a loop
		 * 
		 * for(a1 ; b1 ; c1)
		 * {
		 * 		// work 1 
		 * 		for(a2 ; b2 ; c2)
		 * 		{
		 * 			// work 2
		 * 		}
		 * }
		 * 					
		 */
		
		/*
		 *  print : *
		 *  		**
		 *  		***
		 * 			****
		 * 			*****
		 * 			  :
		 * 			  : (n times) - n given by user
		 * 
		 * 			row 1 - 1 star
		 * 			row 2 - 2 stars
		 * 			row 3 - 3 stars ....
		 * 
		 * ==> no. of stars = row value
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of steps : ");
		int n = sc.nextInt();
		
		/*
		 * i -> steps/rows
		 * j -> stars
		 */
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------------");
		
		// WHILE LOOP : 
		/*
		 * while loop : runs until the given condition is
		 * 					true.
		 *  
		 *  while loop syntax : 
		 *  a. initialization
		 *  while(b. condition)
		 *  {
		 *  	d. work 
		 *  	c. increment/decrement
		 *  }
		 *  
		 *  flow : a
		 *  	   b , d , c | b , d , c | b , d , c | .......
		 *  
		 *  Note : 
		 *  1. a,b are compulsory in while loop.
		 *  2. if c is missing then it leads to an infinite loop.
		 * 		  
		 * 
		 * infinite while loop :
		 * while(true)
		 * {
		 * 		// work
		 * }
		 *  		
		 */
		
		// print even numbers from 1-100 using while loop
		
		int i=1 ; // initialization
		while(i<=100) // condition
		{
			// work
			if(i%2 == 0)
				System.out.println(i);
			
			i++ ; // increment
		}
		
		System.out.println("---------------------");
		
		// No. of digits of the given number
		
		System.out.println("Enter a number : ");
		int n1 = sc.nextInt() ;
		int temp = n1 ;
		int count = 0 ;
		while(temp > 0)
		{
			count++ ;
			temp = temp/10 ;
		}
		System.out.println(n1 + " has " + count + " digits");
		
		System.out.println("---------------------");
		
		
		// do-while loop
		/*
		 * do-while loop :
		 * 1. similar to while loop
		 * 2. in while loop 
		 * 				- 1st condition checking next work. 
		 * 3. but in do-while loop
		 * 				- 1st work then condition checking.
		 * 
		 * syntax :
		 * a. initialization
		 * do
		 * {
		 * 		d. work
		 * 		c. increment/decrement
		 * }
		 * while(b. condition);
		 * 
		 * flow : a
		 * 		  d , c , b | d , c , b | d , c , b | .......
		 * 
		 * Note : 
		 *  1. a,b are compulsory in do-while loop.
		 *  2. if c is missing then it leads to an infinite loop.
		 *  3. do-while loop , executes atleast 1 time even if
		 *  	condition is false.
		 * 
		 */
		
		int num = 1 ;
		do
		{
			System.out.println("chandu");
			num++ ;
		}
		while(num>=5); // here the condition is false but still
			           //      loop executed once.         
		
		
		System.out.println("-------------END-------------");
		
		
	}
}
