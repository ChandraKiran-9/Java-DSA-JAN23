package Chapter02_Problems;

import java.util.Scanner;

/*
 * given number is even / odd 
 */
public class Problem_001 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt() ;
		
		if(n%2 == 0)
		{
			System.out.println(n + " is even number");
		}
		else 
		{
			System.out.println(n + " is odd number");
		}
		
	}
}
