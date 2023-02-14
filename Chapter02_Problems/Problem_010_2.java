package Chapter02_Problems;

import java.util.Scanner;

/*
 * Armstrong numbers in the given Range
 */
public class Problem_010_2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Range : ");
		int sp = sc.nextInt();
		int ep = sc.nextInt();
		
		for(int i=sp ; i<=ep ; i++)
		{
			int temp = i ;
			int digits = (int)Math.log10(temp)+1 ;
			
			int res = 0 ;
			while(temp > 0)
			{
				int ld = temp%10 ;
				res = res + (int)Math.pow(ld, digits);
				temp = temp/10 ;
			}
			if(res == i && i != 0)
			{
				System.out.println(i + " : Armstrong Number");
			}
		}
		
	}
}
