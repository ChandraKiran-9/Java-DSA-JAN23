package Chapter02_Problems;

import java.util.Scanner;

/*
 * given number is armstrong number/not
 */
public class Problem_010_1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt() ;
		
		int temp = n ;
		int digits = (int)Math.log10(temp)+1 ;
		// System.out.println(digits);
		
		int res = 0 ;
		while(temp > 0)
		{
			int ld = temp%10 ;
			res = res + (int)Math.pow(ld, digits) ;
			temp = temp/10 ;
		}
		if(res == n)
		{
			System.out.println(n + " : Armstrong number");
		}
		else
		{
			System.out.println(n + " : not an Armstrong number");
		}
		
	}

}
