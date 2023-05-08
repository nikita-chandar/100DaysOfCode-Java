/*Day 39 coding Statement : Write Program to find sum of elements in an array
Description:Get an array as the input from the user and find the sum of the elements.

Input:Enter the size of array
3

Enter the elements of array
5 10 15

Output:30*/

import java.util.Scanner;
class Sum
{
     public static void main(String a[])
	 {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array: ");
        int  n = sc.nextInt();
        int[]arr = new int[n];
	    int i;
		System.out.println("Enter the elements of array");
		for( i = 0; i < n; i++)
         {
           arr[i] = sc.nextInt();
		 }
		 int sum=0;
		 for( i = 0; i < arr.length; i++)
		 {
			 sum=arr[i]+sum;
		 }
		
		 System.out.println("SUM:"+sum);
	 }
	
} 