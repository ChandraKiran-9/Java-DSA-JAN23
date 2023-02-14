package Chapter02_zPatterns;

import java.util.Scanner;

/*
 * question:
 * 			1  2  3
 * 	        6  5  4
 *          7  8  9
 *          12 11 10
 *          
 *       -> n steps (n is given by the user) 
 *          
 */
public class zNumber_Pattern_008 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n = sc.nextInt();
		
		int count = 1 ;
		for(int i=1 ; i<=n ; i++)
		{
			if(i%2 != 0 && i == 1)
			{
				for(int j=1 ; j<=3 ; j++)
				{
					System.out.print(count + " ");
					count++ ;
				}
				count-- ;
			}
			else if(i%2 != 0)
			{
				count = count + 3 ;
				for(int j=1 ; j<=3 ; j++)
				{
					System.out.print(count + " ");
					count++ ;
				}
				count-- ;
			}
			else
			{
				count = count + 3 ;
				for(int j=1 ; j<=3 ; j++)
				{
					System.out.print(count + " ");
					count-- ;
				}
				count++ ;
			}
			System.out.println();
		}
	}
}
