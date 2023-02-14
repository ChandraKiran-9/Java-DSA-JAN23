package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * WAP to find the numbers greater than the average of the numbers
 * of a given array.
 */
public class zProblem_001 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int size = sc.nextInt() ;
		
		System.out.println("Enter the data : ");
		int[] arr = new int[size];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt() ;
		}
		
		System.out.println("Array Entered : ");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// calculating average 
		int sum = 0 ;
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		double average = sum/arr.length ;
		
		System.out.print("Values greater than average : ");
		// printing values greater than average
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i] > average)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
	}
}
