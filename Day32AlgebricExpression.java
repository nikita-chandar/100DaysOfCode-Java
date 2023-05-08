/*Day 30 coding Statement : Write a Program to Remove brackets from an algebraic expression

Description
Get an algebraic expression as input from the user and then remove all the brackets in that.

Input
7x+(2*y)

Output
7x+2*y

 */
 import java.util.Scanner;
 class Expression
 {
     public static void main(String a[])
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Entre any Number");
	String str=sc.nextLine();
    String NewString=str.replaceAll("[(){}]","");
    System.out.println("Expression without brackets:"+NewString);	
     }
 }