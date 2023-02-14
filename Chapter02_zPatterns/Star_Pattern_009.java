package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 			*********
 * 			 *******
 * 			  *****
 * 			   ***
 * 				*
 * 
 * for n = 5 :
 * 		row		spaces		stars
 * 		 1        0           9
 *       2        1           7
 *       3        2           5
 *       4        3           3
 *       5        4           1
 *       
 *    stars = 2*(n-row value) + 1
 *       
 */
public class Star_Pattern_009 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt() ;
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<i ; j++)
			{
				System.out.print(" ");
			}
			for(int k=1 ; k<=(2*(n-i))+1 ; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
