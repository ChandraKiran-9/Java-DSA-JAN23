package Chapter02_Problems;

import java.util.Scanner;

/*
 * given number is prime or not
 */
public class Problem_007_1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		boolean res = true ;
		// checking prime or not
		/*
		 * i <= n-1  or
 		 * i <= Math.sqrt(n) -> best approach
		 */
		for(int i=2 ; i <= Math.sqrt(n) ; i++)
		{
			if(n%i == 0)
			{
				res = false ;
			}
		}
		if(res == true)
		{
			System.out.println(n + " : prime number");
		}
		else
		{
			System.out.println(n + " : not a prime number");
		}
		
	}

}
