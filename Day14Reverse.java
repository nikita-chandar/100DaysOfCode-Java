/*Day 12 coding Statement : Write a program to reverse a given number
Description
Get an input from the user and the print the reverse of the given number as the output

E.g. let the number be 324 then the reverse of the number is 423

Input

675

Output
576*/
import java.util.Scanner;
public class ReverseNumber
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		int n = sc.nextInt();
		int reverse=0;
		for(int i=n;i!=0;i=i/10)
		{
			int lastDigit=i%10;
			reverse=reverse*10+lastDigit;
			
			
		}
		System.out.println(reverse);
	}
}