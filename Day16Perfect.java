/*Day 14 coding Statement : Write a program to identify if the number is Perfect number or not
Description
Get the input from the user and check whether that number is a perfect number or not.
E.g. Let number is 28, factors of 28 are 1,2,4,7,14. Now the sum of all these factors are 28 itself.
Input:28
Output:Perfect Number
Input:4
Output:Not a perfect number */

import java.util.Scanner;
class PerfectNum
  {
	  public static void main(String a[])
	  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a Number");
	  int num=sc.nextInt();
	
	int sum=0;
	  for(int i=1;i<num;i++)
	  {
		   if(num%i==0)
		    sum=i+sum;
		   
	  }
	  
		 if(sum==num)
		  {
			  System.out.println(+num+" is Perfect Number");
		  }
		  else
		  {
			   System.out.println(+num+" is Not a Perfect Number");
		  }
	  }
		  
	  }
	  
  
 