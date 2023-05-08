/*Day 39 coding Statement : Write a Program to check if two strings are Anagram or not

Description

Get two strings as input from the user and check whether it is Anagram or not.

Input

sunlight thgiluns

Output

Anagram*/

import java.util.Arrays;
import java.util.Scanner;

class Anargram{
  public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
      System.out.print("Enter a first string: ");
      String str1 = sc.nextLine();
	    System.out.print("Enter a second string: ");
      String str2 = sc.nextLine();
    
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    
    if(str1.length() == str2.length()) {

      // convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
  }
}
