/*Day 31 coding Statement : Write a Program to check if String is a palindrome or not
Description
Get an input string from the user and then check whether it is a palindrome string or not.

Input:noon
Output:Palindrome

Input:Talent
Output:Not a Palindrome

*/
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Entre any String");
	     String s=sc.nextLine();
		  int strLength=s.length();
		 String reversestr="";
		
		 for(int i=(strLength-1);i>=0;i--)
		 {
			reversestr=reversestr+s.charAt(i);
			 
		 }
		 if(s.equalsIgnoreCase(reversestr))
		 {
			 System.out.println(s+"is a palindrome string.");
		 }
		 else
		 {
			 System.out.println(s+"is not a palindrome");
		 }
	}
}