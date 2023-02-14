package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 			*****
 * 			****
 * 			***
 * 			**
 * 			*
 *  n steps - n is given by the user
 *  
 *  for n = 5
 *         row       stars
 *          1          5
 *          2          4
 *          3          3
 *          4          2
 *          5          1
 *          
 */
public class Star_Pattern_002
{
	public static void main(String[] args) 
	{
		/*
		 * row 1 = n stars
		 * row 2 = n-1 stars
		 * row 3 = n-2 stars
		 * .
		 * .
		 * .
		 * row n = 1 star
		 * 
		 *  i -> rows
		 *  j -> stars
		 *  
		 *  stars --> n value
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt() ;
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=n ; j>=i ; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
