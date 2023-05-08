/*Day 41 coding Statement : Given an integer array of size N, write a program to reverse the array;
Sample input 1:4
2 4 1 3
Sample output 1:
3 1 4 2
*/
import java.util.*;
class Array
{
    static void Reverse(int arr[], int n)
    {
        int temp;
        for(int i = 0 ; i<n/2 ; i++)
        {
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
      public static void main(String[] args) throws java.lang.Exception
      {
          Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the size of array ");
          int n = sc.nextInt();
		  System.out.println("Enter the array of size n");
          int arr[] = new int[n];
          for(int i = 0 ; i<n ; i++)
          {
            arr[i] = sc.nextInt();
          }
        Reverse(arr,n);
        for(int i = 0 ; i<n ; i++)
        {
            System.out.print(arr[i] + " ");
        }      }
}