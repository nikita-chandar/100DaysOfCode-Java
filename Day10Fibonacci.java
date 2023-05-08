/*Day 10 coding Statement:  Write a program to find Fibonacci series up to n
Description: Fibonacci series is a special series where nth term is the sum of previous two terms in the series. The series starts with 0 and 1 as the first and second term of the series respectively.
Here you need to get the value for nth term from user and then print Fibonacci series containing n terms.

Input:5

Output:0,1,1,2,3

Input:8

Output:0,1,1,2,3,5,8,13
 */
import java.util.Scanner;
class Fibonaciiseries
{
	public static void main(String a[])
	{
		int x=0;
		int y=1;
	  Scanner sc=new Scanner(System.in);
	  int num =sc.nextInt();
	  System.out.println(x);
	  System.out.println(y);
	  for(int i=0;i<=num;i++)
	  {
		  int z=x+y;
		  System.out.println(z);
		  x=y;
		  y=z; 
	  }  
	}
}