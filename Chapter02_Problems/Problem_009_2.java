package Chapter02_Problems;

import java.util.Scanner;

/* 
 * palindrome numbers in the given range
 */
public class Problem_009_2 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range : ");
		int sp = sc.nextInt();
		int ep = sc.nextInt();
		
		for(int i=sp ; i<=ep ; i++)
		{
			int temp = i ;
			int res = 0 ;
			
			while(temp > 0)
			{
				int ld = temp%10 ;
				res = res*10 + ld ;
				temp = temp/10 ;
			}
			if(res == i)
			{
				System.out.println(i + " : palindrome number");
			}
		}
		
	}
}
