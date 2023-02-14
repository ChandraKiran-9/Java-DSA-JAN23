package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * write a method to print fibonacci series of n terms
 * n - given by user.
 */
public class zProblem_007
{
	
	public static void printFibonacci(int n)
	{
		int a = 0 ;
		int b = 1 ;
		
		System.out.print(a + " " + b + " ");
		
		for(int i=3 ; i<=n ; i++)
		{
			int c = a+b ;
			System.out.print(c + " ");
			a = b ;
			b = c ;
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the n value : ");
		int n = sc.nextInt() ;
		
		printFibonacci(n);
		
	}
}
