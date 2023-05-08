/*Day 18 coding Statement : Write a program to identify if the number is Palindrome or not
Description
Get a number as input from the user and check whether that number is a Palindrome or not.
Input
121
Output
Palindrome
Input
34
Output
Not a Palindrome*/

import java.util.Scanner;
class Palindrome
{
public static void main(String[] args)
 {     Scanner sc=new Scanner(System.in);
 System.out.println("Entre any Number");
       int num = sc.nextInt();
	  int reverseNum=0, rem=0;
	  int Originalnum=num;
	   for(int i=0;num>0;i=num/=10)
	   {
		   rem=num%10;
		   reverseNum =(reverseNum*10)+rem;   
	   }
	   
	   if(Originalnum==reverseNum)
	   {
		   System.out.println(+Originalnum+" is Palindrome Number");
	   }
	   else
	   {
		   System.out.println(+Originalnum+" Not a Palindrome Number");
	   }
 }
}