package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question :
 * 		1
 * 		1 2
 * 		1 2 3
 * 		1 2 3 4 
 * 		1 2 3 4 5
 *          :
 *          :  (n times - n is given by user)
 */
public class zNumber_Pattern_001 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
