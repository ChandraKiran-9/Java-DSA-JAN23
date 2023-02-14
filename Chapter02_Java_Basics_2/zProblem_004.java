package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * WAP to find the maximum and minimum values in an given array.
 */
public class zProblem_004 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int size = sc.nextInt();
		
		System.out.println("Enter the array values : ");
		int[] arr = new int[size];
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i] = sc.nextInt() ;
		}
		
		System.out.print("Array Entered : ");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// finding maximum and minimum
		int max = arr[0] ;
		int min = arr[0] ;
		
		for(int i=1 ; i<arr.length ; i++)
		{
			if(arr[i] > max)
				max = arr[i] ;
			
			if(arr[i] < min)
				min = arr[i] ;
		}
		System.out.println("Maximum : " + max);
		System.out.println("Minimum : " + min);
		
		
	}
}
