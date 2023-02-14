package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question: 
 * 					*
 * 				   **
 * 				  ***
 * 				 ****
 * 				*****
 * 				 ****
 * 				  ***
 * 				   **
 * 					*
 * 
 * combination of star patterns 4 & 5 .
 * top     -> we get from star pattern 4
 * buttom  -> we get from star pattern 5
 * 
 */
public class Star_Pattern_006 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		
		/*
		 * Top - for n = 5 :
		 * 			*
		 * 		   **
		 * 		  ***
		 * 		 ****
		 *		*****
		 *
		 *		row		spaces		stars
		 *		 1        4           1
		 *       2        3           2
		 *       3        2           3
		 *       4        1           4
		 *       5        0           5
		 */
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=(n-1) ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * Buttom for n = 5 :
		 * 		   *****
		 * 			****
		 * 			 ***
		 * 			  **
		 * 			   *
		 * 
		 *  	row 	spaces 		stars
		 *  	 1        0           5
		 *  	 2        1           4
		 *  	 3        2           3
		 *   	 4        3           2
		 *   	 5	      4           1
		 *  
		 */
		
		for(int i=1 ; i<=(n-1) ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(" ");
			}
			for(int k=(n-1) ; k>=i ; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
