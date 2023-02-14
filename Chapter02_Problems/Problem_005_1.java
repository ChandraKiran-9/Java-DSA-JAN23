package Chapter02_Problems;

import java.util.Scanner;

/*
 * factorial of a number without recursion
 */
public class Problem_005_1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt() ;
		
		int res = 1 ;
		for(int i=n ; i>=1 ; i--)
		{
			res = res*i ;
		}
		System.out.println(n + "! = " + res );
		
	}
}
