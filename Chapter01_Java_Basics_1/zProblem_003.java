package Chapter01_Java_Basics_1;

import java.util.Scanner;

// WAP that converts inches into meters

public class zProblem_003 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value in inches : ");
		float inch = sc.nextFloat();
		
		double meter = inch/39.37 ;
		System.out.println(inch + "inch -> " + meter + "meters");
		
	}

}
