package Chapter01_Java_Basics_1;

import java.util.Scanner;

// WAP that takes 2 numbers as i/p and displays product of them

public class zProblem_001 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("product of the numbers : " + num1*num2);
	}

}
