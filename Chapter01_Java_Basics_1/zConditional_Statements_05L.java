package Chapter01_Java_Basics_1;

import java.util.Scanner;

public class zConditional_Statements_05L
{
	public static void main(String[] args) 
	{
		/*
		 * Conditional statements :
		 * 			if / if-else / if-else if-else
		 * 			nested if-else
		 * 			switch-case
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * if syntax :
		 * 
		 * if(condition)
		 * {
		 * 		// if this condition is true then this block
		 * 				gets executed
		 * }
		 * 
		 */
		
		
		/*
		 * if-else syntax :
		 * 
		 * if(condition)
		 * {
		 * 		// if this condition is true then this block
		 * 				gets executed
		 * }
		 * else
		 * {
		 * 		// if this condition is false then this block
		 * 				gets executed
		 * }
		 */
		
		
		// eligible for voting/not ?
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		System.out.println("voting started");
		
		if(age >= 18)
		{
			System.out.println("Welcome sir !!!.. you can vote");
		}
		else
		{
			System.out.println("sorry! you are not eligible");
		}
		
		System.out.println("voting ended");
		
		
		System.out.println("-----------------------");
		
		
		/* if-else if-else syntax :
		 * 
		 * if(condition 1)
		 * {
		 * 	  // if this condition 1 is true then this block
		 * 				gets executed
		 * }
		 * else if(condition 2)
		 * {
		 * 	  // if this condition 1 is false and condition 2 
		 * 			is true	then this block gets executed
		 * }
		 * else if(condition 3)
		 * {
		 *    // if this condition 1,2 are false and condition 3 
		 * 			is true	then this block gets executed
		 * }
		 *  	:
		 *  	:
		 *  	:
		 *  else
		 *  {
		 *    // if all the above conditions are false then
		 *         this block gets executed
		 *  }
		 */
		
		// marks grading system
		/*
		 * 90-100 -> A grade
		 * 80-90  -> B grade
		 * 70-80  -> C grade
		 * 60-70  -> D grade
		 * 50-60  -> E grade
		 * 40-50  -> F grade
		 * < 40    -> fail
		 */
		
		System.out.println("Enter the marks : ");
		int marks = sc.nextInt();
		int m = marks ;
		
		if(m >= 90 && m <= 100) {
			System.out.println("A grade");
		}
		else if(m >= 80 && m < 90) {
			System.out.println("B grade");
		}
		else if(m >= 70 && m < 80) {
			System.out.println("C grade");
		}
		else if(m >= 60 && m < 70) {
			System.out.println("D grade");
		}
		else if(m >= 50 && m < 60) {
			System.out.println("E grade");
		}
		else if(m >= 40 && m < 50) {
			System.out.println("F grade");
		}
		else if(m < 40 && m >= 0) {
			System.out.println("sorry you are failed");
		}
		else
		{
			System.out.println("Invalid marks");
		}
		
		
		System.out.println("-----------------------");
		
		/*
		 * nested if-else syntax :
		 * 
		 * if(condition 1)
		 * {
		 * 		// condition 1 is true
		 * 
		 * 		if(condition 2)
		 * 		{
		 * 			 // condition 1 is true and condition 2 is
		 * 				   true
		 * 		}
		 * 		else{
		 * 		     // condition 1 is true and condition 2 is
		 * 				   false
		 * 		}
		 * }
		 * else
		 * {
		 * 		// condition 1 is false
		 * 
		 * 		if(condition 2)
		 * 		{
		 * 			// condition 1 is false and condition 2 is 
		 * 					true
		 * 		}
		 * 		else
		 * 		{
		 * 			// condition 1 is false and condition 2 is 
		 * 					false
		 * 		}
		 * }
		 */
		
		
		// greater of 3 numbers
		
		System.out.println("Enter 3 numbers : ");
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
		
		System.out.println("-----------------------");
		
		/*
		 * switch-case :
		 * 
		 * switch(expression) 
		 * {
		 * 		case value1 :
		 * 			// code block
		 * 			break ;
		 * 
		 * 		case value2 :
		 * 			// code block
		 * 			break ;
		 * 
		 * 			:
		 * 			:
		 * 			:
		 * 	
		 * 		default :
		 * 			// code block
		 * }
		 * 
		 */
		
		
		// simple calculator using switch case
		
		System.out.println("Enter the numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the operation : ");
		String op = sc.nextLine();
		
		switch(op) // op - string expression
		{
		case "+":
			System.out.println(num1+num2);
			break ;
		case "-":
			System.out.println(num1-num2);
			break ;
		case "*":
			System.out.println(num1*num2);
			break ;
		case "/":
			System.out.println(num1/num2);
			break ;
		case "%":
			System.out.println(num1%num2);
			break ;
		default :
			System.out.println("invalid operator");
		}
		
		
	}
}
