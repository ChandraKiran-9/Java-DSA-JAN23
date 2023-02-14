package Chapter02_Problems;

import java.util.Scanner;

/*
 * multiplication table of the given number
 */
public class Problem_004 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt() ;
		
		for(int i=1 ; i<=10 ; i++)
		{
			System.out.println(n*i);
		}
	}

}
