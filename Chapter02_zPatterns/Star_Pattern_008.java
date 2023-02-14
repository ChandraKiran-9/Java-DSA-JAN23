package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 			*
 * 		   ***
 * 		  *****
 * 		 *******
 * 		*********
 * 
 * for n = 5 :
 * 		row		spaces		stars
 * 		 1        4           1
 *       2        3           3
 *       3        2           5
 *       4        1           7
 *       5        0           9
 *       
 *   stars = 2(row value)-1 
 *   spaces = n - row value
 *   
 */
public class Star_Pattern_008 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=(n-1) ; j>=i ; j--)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=(2*i)-1 ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
