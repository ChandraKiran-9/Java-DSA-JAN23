package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question: 
 * 			*****
 * 			*   *
 * 			*   *
 * 			*	*
 * 			*****
 * 
 * hollow square : using matrix ideology
 * 
 */
public class Star_Pattern_011
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=n ; j++)
			{
				if(i == 1 || i == n || j == 1 || j == n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
