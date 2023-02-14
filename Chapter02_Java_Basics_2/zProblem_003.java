package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * WAP to display sum of the array values.
 */
public class zProblem_003 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// taking array input from the user
		System.out.println("Enter the array size : ");
		int size = sc.nextInt() ;
		
		System.out.println("Enter the array values : ");
		int[] arr = new int[size];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt() ;
		}
		
		System.out.print("Array entered : ");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		// calculating the sum of the values
		int sum = 0 ;
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of the array values : " + sum); 
		
		
	}

}
