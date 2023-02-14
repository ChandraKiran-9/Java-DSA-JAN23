package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 			*
 * 		   * *
 * 		  * * *
 * 		 * * * *
 * 	 	* * * * *
 * 
 * triangle pattern with spaces between the stars.
 * 
 * we can get this through star pattern 4 , by keeping spaces 
 * in b/w while printing the stars.
 */
public class Star_Pattern_007 {

	public static void main(String[] args)
	{
		/*
		 * star pattern 4 
		 * for n = 5 :
		 * 		row    spaces   stars
		 * 		 1       4        1
		 *       2       3        2
		 *       3       2        3
		 *       4       1        4
		 *       5       0        5
		 *       
		 * while printing by giving space in b/w the stars ,
		 * we can get this triangle pattern.
		 *       
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt() ;
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=n-1 ; j>=i  ; j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=i ; k++)
			{
				System.out.print("* "); // printing 
			}
			System.out.println();
		}
		
	}
}
