package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question: 
 * 			*
 * 			**
 * 			***
 * 			****
 * 			*****
 * 			****
 * 			***
 * 			**
 * 			*
 * 
 * combination of star pattern 1 & 2 : 
 * top     -> we get from star pattern 1
 * buttom  -> we get from star pattern 2
 */
public class Star_Pattern_003 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1 ; i>=1 ; i--)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
