package Chapter01_Java_Basics_1;

import java.util.Scanner;

// WAP to display largest among 3 numbers

public class zProblem_004 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a + " is largest");
			}
		}
		if(b>c)
		{
			if(b>a)
			{
				System.out.println(b + " is largest");
			}
		}
		if(c>a)
		{
			if(c>b)
			{
				System.out.println(c + " is largest");
			}
		}
		
	}

}
