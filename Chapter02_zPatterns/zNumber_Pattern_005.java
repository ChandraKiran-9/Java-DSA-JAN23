package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question :
 * 		5 4 3 2 1
 * 		5 4 3 2
 * 		5 4 3
 * 		5 4
 * 		5
 * 
 *  n times - n is given by the user
 *  
 */
public class zNumber_Pattern_005 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=n ; j>=i ; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
