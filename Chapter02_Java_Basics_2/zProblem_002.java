package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * WAP that takes a number and prints its multiplication upto 10 .
 */
public class zProblem_002 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.println("Table of " + n + " : ");
		for(int i=1 ; i <= 10 ; i++)
		{
			System.out.println(n*i);
		}
		
	}

}
