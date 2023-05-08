/*Day 24 coding Statement : Write a program to print Pyramid pattern using stars
Description
Get the number of lines as the input and print stars in that many lines or rows in a pyramid shape.
Input
4
Output
  *
  **
  ***
  ****
 */
 
 import java.util.Scanner;
 class pyramid
 {
	 public static void main(String a[])
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Entre a number");
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i++)
	 {
		 for(int j=1;j<=n;j++)
		 {
			 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++)
		  {
			 System.out.print("*");
		  }
		 System.out.println();
	 }
	}	 
 }