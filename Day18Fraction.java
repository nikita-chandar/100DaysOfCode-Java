/*Day 18 coding Statement : Write a program to Add two fractions

Description

Get the values for numerator and denominator of two fractions, then add that fractions. Consider the following format

x3/y3 = (x1/y1) + (x2/y2)

here x3 = (x1*y2) + (x2*y1) and y3 = (y1*y2)

Input

2  3

4  3

Output

2/1   */

import java.util.Scanner;
class Factions
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of numerator ");
		int x1=sc.nextInt();
		System.out.println("Enter values of numerator");
		int x2=sc.nextInt();
	
		System.out.println("Enter values of denominator ");
		int y1=sc.nextInt();
		System.out.println("Enter values of denominator ");
		int y2=sc.nextInt();
		int y3,x3=0;
		//int output=X3/Y3;
		//X3/Y3=(X1/Y1)+(X2/Y2);
		System.out.println(x3 = (x1*y2) + (x2*y1) );
             System.out.println(y3 = (y1*y2));
			 
			 
			 
			  System.out.println("Sum of fractions is "+x3+"/"+y3); 
			 }} 
			 
			 