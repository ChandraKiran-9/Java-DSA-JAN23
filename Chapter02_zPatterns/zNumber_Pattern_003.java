package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 		1
 * 		2 3
 * 		4 5 6
 * 		7 8 9 10
 * 		  :
 * 		  : (n times - n is given by the user)
 */
public class zNumber_Pattern_003
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt() ;
		
		int count = 1 ;
		for(int i=1 ; i<=n ; i++)
		{
			for(int j=1 ; j<=i ; j++)
			{
				System.out.print(count + " ");
				count++ ;
			}
			System.out.println();
		}
	
	}

}
