package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 			1
 * 			2 5 
 * 			3 6 8
 * 			4 7 9 10 
 * 
 *  -> n times - n is given by the user
 *  
 *  
 *  
 */
public class zNumber_Pattern_007
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			int res = i ;
			System.out.print(res + " "); 
			for(int j=1 ; j<i ; j++)
			{
				res = res + (n-j);
				System.out.print(res + " ");
			}
			System.out.println();
		}
		
	}
}
