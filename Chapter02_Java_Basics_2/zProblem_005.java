package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * WAP to seperate 0's on left side and 1's on right side of 
 * an array where 0's and 1's are in random order.
 */
public class zProblem_005 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		int size = sc.nextInt() ;
		
		System.out.println("Enter the array : ");
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
		
		// seperation 
		/*
		 * if i==0 & j==0 -> i++
		 * if i==1 & j==0 -> swap i,j & i++ , j--
		 * if i==0 & j==1 -> i++ , j--
		 * if i==1 & j==1 -> j-- 
		 */
		
		int i = 0 ; 
		int j = arr.length-1 ;
		while(i <= j)
		{
			if(arr[i] == 0 && arr[j] == 0)
			{
				i++ ;
			}
			else if(arr[i] == 1 && arr[j] == 0)
			{
				// swap i , j
				int k = arr[i] ;
				arr[i] = arr[j] ;
				arr[j] = k ;
				
				i++ ;
				j-- ;
				
			}
			else if(arr[i] == 0 && arr[j] == 1)
			{
				i++ ;
				j-- ;
			}
			else if(arr[i] == 1 && arr[j] == 1)
			{
				j-- ;
			}
		}
		
		System.out.print("After swaping : ");
		for(int k=0 ; k<arr.length ; k++) {
			System.out.print(arr[k] + " ");
		}
		System.out.println();
		
	}

}
