package Chapter01_Java_Basics_1;

import java.util.Scanner;

// WAP to print area & perimeter of a circle

public class zProblem_002 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int r = sc.nextInt();
		
		double perimeter = 2*3.14*r ;
		System.out.println("Perimeter : " + perimeter);
		
		double area = 3.14*r*r ;
		System.out.println("Area : " + area);
	}

}
