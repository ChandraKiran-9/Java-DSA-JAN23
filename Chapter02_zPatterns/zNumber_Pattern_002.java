package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 		1
 * 		2 2
 * 		3 3 3
 * 		4 4 4 4
 * 		5 5 5 5 5
 * 			:
 * 			: (n times - n is given by the user)
 * 
 */
public class zNumber_Pattern_002
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt() ;
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}
