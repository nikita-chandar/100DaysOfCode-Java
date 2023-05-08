/*Day 27 coding Statement : Write a Program to print Length of the string without using strlen() function

Description

Get a string as input from user and print the length of the string without using strlen() function.

Input

Hello

Output

5*/

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int length=0;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Entre any String");
	     String s=sc.nextLine();
                
                for (char c1 : s.toCharArray()) 
				{
				length++;
				}
		System.out.println("Length of String is : "+length);
		
	}

}