package Chapter01_Java_Basics_1;

import java.util.Scanner;

// WAP for students marks grade
/*
 * 90-100 -> A grade
 * 80-90  -> B grade
 * 70-80  -> C grade
 * 60-70  -> D grade
 * 50-60  -> E grade
 * 40-50  -> F grade
 * < 40    -> fail
 */

public class zProblem_007 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
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
	}
}
