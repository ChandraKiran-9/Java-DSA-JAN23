package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 			*****
 * 			 ****
 * 			  ***
 * 			   **
 * 				*
 * n steps - n given by the user
 * 
 *  i -> rows
 *  j -> spaces
 *  k -> stars
 *  
 *  for n = 5 : 
 *  	row		spaces		stars
 *  	 1        0           5
 *  	 2        1           4
 *       3        2           3
 *       4        3           2
 *       5        4           1
 */
public class Star_Pattern_005
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt() ;
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=2 ; j<=i ; j++)
			{
				System.out.print(" ");
			}
			for(int k=n ; k>=i ; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
