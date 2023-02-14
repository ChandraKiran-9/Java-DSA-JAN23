package Chapter02_Problems;

import java.util.Scanner;

/*
 * fibonacci series without recursion
 */
public class Problem_008_1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
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
		
	}

}
