package Chapter02_Problems;

import java.util.Scanner;

/*
 * reverse a string
 */
public class Problem_006_2 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		String res = "";
		for(int i=str.length()-1 ; i>=0 ; i--)
		{
			res = res + str.charAt(i);
		}
		
		System.out.println("Reverse of " + str + " : " + res);
		
	}

}
