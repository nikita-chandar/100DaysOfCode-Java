/*Day 3 coding Statement: Write a program to find ASCII values of a character
Description:Get an input character from the user and give the ASCII value of the given input as the output.

Input:b

Output:98

Input:B
Output:66
*/

import java.util.Scanner;
class Ascii
{
public static void main(String a[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the first Charchter");
  char b=sc.next().charAt(0);
  int ch=(int) b; //typecasting
  System.out.println("ASCII VALUE IS:"+ch);
  System.out.println("Enter the second Charchter");
  char B=sc.next().charAt(0);
  int ch1=(int)B; //typecasting
  System.out.println("ASCII VALUE IS:"+ch1);
  
  }
}