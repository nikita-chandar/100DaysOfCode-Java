/*Day 2 coding Statement : Write a program to identify if the character is an alphabet or not.

Description:

Take an input character from user and check whether it is an alphabet or not.

Input :

A

Output: 

Alphabet

Input:

7

Output:

Not an alphabet

 */
 
 import java.util.Scanner;
 class Alphabet
 {
 public static void main(String[] args)
 {
	 
	 Scanner s=new Scanner(System.in);
	 System.out.println("Entre the charchter");
	 char ch=s.next().charAt(0); 
	 if(ch>='a'&& ch<='z' &&ch>='A' && ch<='Z')
	 {
		  System.out.println(" Alphabet");
	 }
	 else
	 {
		 System.out.println("Not an Alphabet");
	 }
	 
 }
 }