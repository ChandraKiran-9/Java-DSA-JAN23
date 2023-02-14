package Chapter01_Java_Basics_1;

import java.util.Scanner;

// WAP to swap 2 numbers

public class zProblem_006
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to swap");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Numbers before swap");
		System.out.print("Number 1 : " + num1 + "   ");
		System.out.println("Number 2 : " + num2);
		
		System.out.println("-------------------------------");
		
		// method 1 - with 3rd variable
		
		int num3 = num1 ;
		num1 = num2 ;
		num2 = num3 ;
		
		System.out.println("Numbers After 1 swap");
		System.out.print("Number 1 : " + num1 + "   ");
		System.out.println("Number 2 : " + num2);
		
		System.out.println("-------------------------------");
		
		// method 2 - without 3rd variable
		
		num1 = num1 + num2 ;
		num2 = num1 - num2 ;
		num1 = num1 - num2 ;
		
		System.out.println("Numbers After 2 swaps");
		System.out.print("Number 1 : " + num1 + "   ");
		System.out.println("Number 2 : " + num2);
		
		System.out.println("-------------------------------");
		
		// method 3 - using * , / operator
		
		num1 = num1*num2 ;
		num2 = num1/num2 ;
		num1 = num1/num2 ;
		
		System.out.println("Numbers After 3 swaps");
		System.out.print("Number 1 : " + num1 + "   ");
		System.out.println("Number 2 : " + num2);
		
		System.out.println("-------------------------------");
		
		// method 4 - using ^ operator
		
		num1 = num1^num2 ;
		num2 = num1^num2 ;
		num1 = num1^num2 ;
		
		System.out.println("Numbers After 4 swaps");
		System.out.print("Number 1 : " + num1 + "   ");
		System.out.println("Number 2 : " + num2);
		
		System.out.println("-------------------------------");
		
	}

}
