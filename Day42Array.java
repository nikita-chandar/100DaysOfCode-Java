/*Day 38 coding Statement : Write Program to find smallest and largest element in an array
Description
Get an array as input from the user and then find the smallest and largest element in the array.
Input
Enter the size of array :5
Enter the elements :10 20 5 40 30
Output
Smallest Number :
5
Largest Number :
40*/
import java.util.Scanner;
class Array
{
     public static void main(String a[])
	 {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of the array: ");
        int  n = sc.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < n; i++)
         {
           arr[i] = sc.nextInt();
         }
        int large = arr[0], small=arr[0];
        for(int i=0; i<arr.length; i++)  
	      {
           if(small > arr[i])
              small = arr[i];
           if(large < arr[i])
              large = arr[i];
       }
         System.out.println("Smallest Number: "+small);
         System.out.println("Largest Number: "+large);
   }
}

 
	   