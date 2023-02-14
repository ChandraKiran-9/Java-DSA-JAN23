package Chapter02_Problems;

import java.util.Scanner;

/*
 * given number is palindrome number or not
 */
public class Problem_009_1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt() ;
		
		int temp = n ;
		int res = 0 ;
		while(temp > 0)
		{
			int ld = temp%10 ;
			res = res*10 + ld ;
			temp = temp/10 ;
		}
		if(res == n)
		{
			System.out.println(n + " : palindrome number");
		}
		else
		{
			System.out.println(n + " : not a palindrome number");
		}
			
	}
}
