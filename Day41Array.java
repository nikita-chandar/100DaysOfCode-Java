/*Day 43 coding Statement : Write Program to find the array type

Description

Get an array as input from the user and check the type of the array, whether it is odd, even or mixed type.

Input

Enter size of array :

3

Enter elements 

1 3 5

Output

Odd*/
import java.util.*;

public class Main

{

public static void main(String[] args)

{

int n;

Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of the array: ");

n = sc.nextInt();

int[]arr = new int[n];

System.out.println("Enter the array elements: ");

for(int i = 0; i < n; i++)

{

arr[i] = sc.nextInt();

}

int o =0, e = 0;

for(int i = 0; i < n; i++)

{

if(arr[i] % 2 == 1)

o++;

else

e++;

}

if(o == n)

System.out.print("Odd");

else if(e == n)

System.out.print("Even");

else

System.out.print("Mixed");

 

}

}

 