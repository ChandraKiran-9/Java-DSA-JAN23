package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * write a method to find the smallest number among 3 numbers.
 */
public class zProblem_006 
{
	public static int smallest(int a , int b , int c)
	{
		if(a<b)
		{
			if(a<c)
				return a ;
		}
		if(b<c)
		{
			if(b<a)
				return b ;
		}
		if(c<a)
		{
			if(c<b)
				return c ;
		}
		return -1 ;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers : ");
		int num1 = sc.nextInt() ;
		int num2 = sc.nextInt() ;
		int num3 = sc.nextInt() ;
		
		int res = smallest(num1 , num2 , num3); 
		System.out.println("smallest among them : " + res); 
	}

}
