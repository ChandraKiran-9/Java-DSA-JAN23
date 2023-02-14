package Chapter01_Java_Basics_1;

import java.util.Scanner;

// WAP to display the given year is leap year / not
/*
 *  leap year -> 1. 400 divisible 
 *  			 			or
 *  			 2. 4 divisible and 100 not divisible
 */

public class zProblem_005 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		
		if(year<=0) {
			System.out.println("Year is Invalid");
		}
		else
		{
			if((year%400 == 0) || (year%4 == 0 && year%100 != 0))
			{
				System.out.println(year + " is leap year");
			}
			else
			{
				System.out.println(year + " is not leap year");
			}
		}

	}

}
