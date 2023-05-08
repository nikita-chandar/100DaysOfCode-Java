/*Day 11 coding Statement:  Write a program to find Sum of digits of a number
Description
Get a number from user and then find the sum of the digits in the given number.
E.g. let the number = 341
Sum of digits is 3+4+1= 8

Input
4521

Output
12*/
import java.util.Scanner;
public class SumofDigits 
{
	
	
	public static void main(String[] args)
     	{
		int Number, Reminder, Sum = 0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0)
			{
			Reminder = Number % 10;
			Sum = Sum+ Reminder;
			Number = Number / 10;
		    }
		System.out.format("Sum of the digits of Given Number = %d", Sum);
	}
}

