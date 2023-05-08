/*Day 29 coding Statement : Write a Program to Remove vowels from a string

Description
Get a string as the input from the user and then remove all the vowel letters from the string and give the output.

Input
remove

Output
rmv

 */
 
 import java.util.Scanner;
public class Main
 {
  public static void main(String[] args) 
  
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a String : ");
       String str = sc.nextLine();    
       String s = "";
      s=str.replaceAll("[aeiou]","");
	  System.out.println(s);
  }
 }