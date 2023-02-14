package Chapter01_Java_Basics_1;

import java.util.Scanner;

public class User_Input_04L
{
	public static void main(String[] args) 
	{
		// User Input class
		Scanner sc = new Scanner(System.in);
		
		/*
		 * byte -> nextByte()
		 * short -> nextShort()
		 * int -> nextInt()
		 * long -> nextLong()
		 * float -> nextFloat()
		 * double -> nextDouble()
		 * boolean -> nextBoolean()
		 * 
		 * String  -> next() - for single word
		 * 		   -> nextLine() - for sentence/multiple words
		 * 
		 */
		
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		System.out.println("your age : " + age);
		
		System.out.println();
		
		System.out.println("Enter the rating : ");
		float rating = sc.nextFloat();
		System.out.println("rating : " + rating);
		
		System.out.println();
		
		System.out.println("Enter the decimal value : ");
		double d = sc.nextDouble();
		System.out.println("double value : " + d);
		
		System.out.println();
		
		System.out.println("u r passed..!!");
		boolean b = sc.nextBoolean();
		System.out.println(b);
		
		System.out.println();
		
		System.out.println("Enter your name");
		sc.nextLine(); // for enter done above
		String name = sc.nextLine();
		System.out.println("welcome " + name);
		
		
	}
}	
