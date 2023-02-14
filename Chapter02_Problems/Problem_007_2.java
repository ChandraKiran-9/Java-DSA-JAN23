package Chapter02_Problems;

import java.util.Scanner;

/*
 * prime numbers in the given range
 */
public class Problem_007_2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int sp = sc.nextInt();
		int ep = sc.nextInt();
		
		System.out.println("Prime numbers : ");
		for(int i=sp ; i<=ep ; i++)
		{
			boolean res = true ;
			for(int j=2 ; j <= Math.sqrt(i) ; j++)
			{
				if(i%j == 0)
				{
					res = false ;
				}
			}
			if(res == true && i != 1) 
			{
				System.out.println(i + " : prime number");
			}
			
		}
		
	}
}
