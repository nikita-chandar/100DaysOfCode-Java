/*Write a program to identify if the number is even or odd
Description
Get a number as input from the user and check whether the given number is odd or even

Input
10

Output
Even

Input
5

Output
Odd*/

 import java.util.Scanner;
 class Day5evenno
 {
    public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
		System.out.println("Entre the  number");
		int no=sc.nextInt();
		if(no%2==0)
		{
		   System.out.println("Nummber is Even");
		}
		else
		{
		 System.out.println("Nummber is Odd");
		}
	}
 }