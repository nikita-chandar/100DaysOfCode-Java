/*Day 4 coding Statement:  Write a program to identify of the a number is positive or negative
Description
Get an input number from the user and check whether it is a positive or negative number.
Input :-10

Output :Negative number

Input :0

Output :Neither positive nor negative

Input :15

Output :Positive number
*/
import java.util.Scanner;
class Positive
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Entre the  first number");
		int a=sc.nextInt();
		//System.out.println("Entre the  second number");
		//int b=sc.nextInt();
		if(a<0 )
		{
			System.out.println("Negative number");
		}
		else if(a>0)
		{
			System.out.println("Positive number");
		}
		else
		{
			System.out.println("Neither positive nor negative");
		}
			
	}
}