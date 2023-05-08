/*Day 15 coding Statement : Write a program to identify if the number is Strong number or not
Description:Get a number as input from user and then check whether that number is a strong number or not. A number is said to be strong number if the sum of the factorial of each digit in the number is same as that of the number.
E.g. let the number be 145
Here 1! + 4! + 5! is 1 + 24 + 120 which is equal to 145 itself.
Input:121
Output:Not a strong number
Input:2
Output:Strong number
*/
import java.util.Scanner;
class StrongNum
{
	public static void main(String a[])
	{
		int Number, Temp, Reminder, Sum = 0, i, Fact;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		Number = sc.nextInt();		
		
		Temp = Number;
		while( Temp > 0)
		{
			Fact = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Fact = Fact * i;
		     	i++;
		    }
		    System.out.println(" The Factorial of " + Reminder + "  =  " + Fact);
		     Sum = Sum + Fact;
		     Temp = Temp /10;
		}
		
		System.out.println(" The Sum of the Factorials of a Given Number " + Number + " =  " + Sum);
		
		if ( Number == Sum )
		{
			System.out.println("\n " + Number + " is a Strong Number");
		}
		else
		{
		   System.out.println("\n " + Number + " is Not a Strong Number");
		}
	}
}