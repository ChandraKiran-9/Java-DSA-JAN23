package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 			*
 * 		   ***
 * 		  *****
 * 		 *******
 * 		*********
 * 		 *******
 * 		  *****
 * 		   ***
 * 			*
 * 
 * combination of star pattern 8 & 9 :
 * top     -> we get from star pattern 8
 * buttom  -> we get from star pattern 9
 * 
 */
public class Star_Pattern_010 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		
		// top
		/*
		 * spaces -> n-row value
		 * stars  -> 2*row value - 1
		 */
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=(n-i) ; j>=1 ; j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<= (2*i)-1 ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		// buttom
		/*
		 * spaces -> row value
		 * stars  -> (n-row value)*2 - 1
		 */
		for(int i=1 ; i<=(n-1) ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=(n-i)*2-1 ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
