package Chapter02_Problems;

import java.util.Scanner;

/*
 * simple caculator
 */
public class Problem_003 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the operands : ");
		int num1 = sc.nextInt() ;
		int num2 = sc.nextInt() ;
		
		System.out.println("Enter the operator : ");
		sc.nextLine();
		String op = sc.nextLine(); 
		
		switch(op)
		{
		case "+" :
			System.out.println("result : " + (num1+num2));
			break ;
		case "-" : 
			System.out.println("result : " + (num1-num2));
			break ;
		case "*" :
			System.out.println("result : " + (num1*num2));
			break ;
		case "/" :
			System.out.println("result : " + (num1/num2));
			break ;
		case "%" :
			System.out.println("result : " + (num1%num2));
			break ;
		default :
			System.out.println("Invalid Operator");
		}
		
		
	}

}
