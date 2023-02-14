package Chapter02_Java_Basics_2;

import java.util.Scanner;

/*
 * Arrays :  
 * - collection of similar type of data.
 * - syntax : DataType[] ArrayName = new DataType[size] ;
 * - array is indexed.
 * - continous memory location.
 */

/*
 * Advantages : 
 * 			- easy to access.
 * 
 * Disadvantages : 
 * 			- we must know the size to create an array.
 * 			- array size is fixed.
 */
public class Arrays_Intro_02L
{
	public static void main(String[] args)
	{
		// creating an array for student grades in 6 subjects.
		char[] grades = new char[6];
		
		// char[] grades ; -> declaration
		// new char[size] ;  -> instantiation 
		
		/*
		 * size = 6
		 * indexes : [0 - (size-1)] = [0,1,2,3,4,5] 
		 * 0 - English
		 * 1 - 2nd Lang.
		 * 2 - Maths
		 * 3 - Science
		 * 4 - Social
		 * 5 - optional
		 */
		
		// initialization
		grades[0] = 'B';
		grades[1] = 'B';
		grades[2] = 'A';
		grades[3] = 'A';
		grades[4] = 'B';
		grades[5] = 'A';
		
		// accessing -> ArrayName[index]
		// size == ArrayName.length
		for(int i=0 ; i<grades.length ; i++)
		{
			System.out.println(grades[i]);
		}
		
		System.out.println("-------------------------------");
		
		/*
		 * if we try access any index that does not exists then 
		 * it will provide an error i.e, ArrayIndexOutOfBound
		 * Exception.
		 */
		
		// System.out.println(grades[6]); - error
		// System.out.println(grades[7]); - error
		// because index 6,7 does not exists for grades array . 
		
		
		// taking array input from user:
		// taking marks from the user for these 6 subjects
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student marks :");
		int[] marks = new int[6];
		for(int i=0 ; i<marks.length ; i++)
		{
			marks[i] = sc.nextInt();
		}
		
		// now displaying the marks array
		System.out.println("marks of the student : ");
		for(int i=0 ; i<marks.length ; i++)
		{
			System.out.print(marks[i] + " ");
		}
		System.out.println();
		
		System.out.println("-------------------------------");
		
		// displaying the marks using for-each loop 
		// for-eack loop is used to traverse list/iterable data.
		System.out.println("marks of the student : ");
		for(int x : marks) // 82 85 93 96 81 92 
		{
			System.out.print(x + " ");
		}
		System.out.println();
		
		System.out.println("-------------------------------");
	}

}
