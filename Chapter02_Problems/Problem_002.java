package Chapter02_Problems;

import java.util.Scanner;

/*
 * given year is leap year or non leap year
 */
public class Problem_002 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = sc.nextInt() ;
		
		if(year<=0)
			System.out.println("Invalid year");
		else if((year%400 == 0) || (year%4==0 && year%100 != 0))
		{
			System.out.println(year + " is leap year");
		}
		else
		{
			System.out.println(year + " is non-leap year" );
		}
	}
}
