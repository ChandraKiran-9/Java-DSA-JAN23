package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * Multi-dimension Arrays :
 * 2D , 3D , ............. Arrays .
 * 
 * 2D Arrays : -> Matrix . 
 * syntax: DataType[][] ArrayName = new DataType[row size][col size];
 * 
 * DataType[][] ArrayName ; -> Declaration
 * new DataType[row size][col size] ; -> instantiation
 * 
 * indexes :
 * - rows -> i = [0 - (row size - 1)] 
 * - columns -> j = [0 - (col size - 1)]  
 * 
 */

/*
 * if we try access any index that does not exists then 
 * it will provide an error i.e, ArrayIndexOutOfBoundException.
 * 
 */

public class Arrays_Intro_03L 
{
	public static void main(String[] args) 
	{
	// declaration & initialization of a 2D Array can be done like 
				int[][] a = {
						{1,2,3},
						{0,1,2},
						{1,0,4}
				};
				// a -> 3 rows & 3 columns
			
		System.out.println(a[0][1]);	
		System.out.println(a[1][1]);
		System.out.println(a[2][2]);
				
		System.out.println("-------------------------------");
				
		// creating a 2D Array / matrix
		int[][] matrix = new int[3][3];
	
		
		// initialization of 2D array
		matrix[0][0] = 1 ;
		matrix[0][1] = 0 ;
		matrix[0][2] = 2 ;
		
		matrix[1][0] = 2 ; 
		matrix[1][1] = 1 ;
		matrix[1][2] = 0 ;
		
		matrix[2][0] = 1 ;
		matrix[2][1] = 3 ;
		matrix[2][2] = 0 ;
		
		
		// displaying 2d Array
		// i -> rows | j -> columns
		
		System.out.println("2D Array : ");  
		// ArrayName.length     == row size
		// ArrayName[0].length  == column size
		for(int i=0 ; i<matrix.length ; i++)
		{
			for(int j=0 ; j<matrix[0].length ; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		
		// taking a 2D array from the user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("User 2D Array");
		System.out.println("Enter the no. of rows : ");
		int n = sc.nextInt() ; // n -> rows
		System.out.println("Enter the no. of columns : ");
		int m = sc.nextInt();  // m -> columns
		
		int[][] temp = new int[n][m]; // array created
		System.out.println("Enter the data : ");
		for(int i=0 ; i<n ; i++) // n == temp.length
		{
			for(int j=0 ; j<m ; j++) // m == temp[0].length
			{
				temp[i][j] = sc.nextInt() ;
			}
		}
		
		// displaying the user 2D Array
		System.out.println("2D Array of the user : ");
		for(int i=0 ; i<temp.length ; i++) 
		{
			for(int j=0 ; j<temp[0].length ; j++)
			{
				System.out.print(temp[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");

	}
}
