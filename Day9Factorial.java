/*Day 10 coding Statement:  Write a program to find Factorial of a number

Description
Get a number from user for which you need to fin the factorial, then calculate the factorial and give it as the output.

Input
4

Output
24*/

import java.util.Scanner;
class Factorial
{
	public static void main(String a[])
	{
	 Scanner sc=new Scanner(System.in);
	  int num =sc.nextInt();
	  long fact=1;
	 System.out.println("enter the number:");
	 for(int i=1;i<=num;i++)
	 {
		 fact=fact*i;
	 }
	 System.out.println("Factorial of "+num+" is:="+fact);
	}
}