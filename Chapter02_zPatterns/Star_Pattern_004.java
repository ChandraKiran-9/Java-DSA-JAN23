package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 			     *
 * 			    **
 * 			   ***
 * 			  ****
 * 			 *****
 * 			   :
 * 			   :  (n times - n is given by the user)
 * 
 * i -> rows
 * j -> stars
 * k -> spaces
 *
 * for n = 5
 * 		row		spaces		stars
 * 		 1        4           1
 *       2        3           2
 *       3        2           3
 *       4        1           4
 *       5        0           5
 *       
 */
public class Star_Pattern_004 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt() ;
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=n-1 ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
