package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question: 
 * 			*
 * 			**
 * 			***
 * 			****
 * 			:
 * 			: (n times - n is given by the user)
 * 
 * for n = 5 
 * 			row     stars
 * 			 1        1
 *           2        2
 *           3        3
 *           4        4
 *           5        5
 * 
 */
public class Star_Pattern_001 
{
	public static void main(String[] args)
	{
		/*
		 * row 1 -> 1 star
		 * row 2 -> 2 stars
		 * row 3 -> 3 stars
		 * .
		 * .
		 * .
		 * 
		 *  i -> rows
		 *  j -> stars
		 *  
		 *  stars --> rows
		 */
		
		
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
		
	}

}
