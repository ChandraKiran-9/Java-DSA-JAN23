package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * WAP to display factorial of the given number.
 * 4! = 24
 * 5! = 120
 * 6! = 720
 * ....
 */
public class zProblem_008 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int res = 1 ;
		for(int i=n ; i>=1 ; i--)
		{
			res = res*i ;
		}
		System.out.println(n + "! = " + res);  
		
		
	}

}
