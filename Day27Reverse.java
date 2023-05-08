/*Day 25coding Statement : Write a Program to reverse a string.

Description
Get an input string from user and print it in reverse order.

Input
Hello

Output
olleH*/

import java.util.Scanner;
class RevesrsString
{
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Entre any Number:");
	String Str=sc.nextLine();
	String rev="";
	char[] arr=Str.toCharArray();
	for(int i=Str.length()-1;i>=0;i--)
	{
		rev=rev+Str.charAt(i);
	}
	System.out.println(rev);
}
}

	

