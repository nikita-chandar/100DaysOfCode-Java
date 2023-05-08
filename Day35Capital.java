/*Day 32 coding Statement : Write a Program to Capitalize the first and last letter of each word of a string
Description
Get a string from the user and then change the first and last letter to uppercase.
Input
programming
Output
ProgramminG*/

import java.util.Scanner;
public class Main{
   public static void main(String[] args) {
   
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = sc.nextLine();  
      System.out.println("Original string is: "+str);
      
      int size = str.length();
      
	   String first = str.substring(0,1);
      String firstinLower = first.toUpperCase();
      
      String last = str.substring(size-1,size);
      String lastinUpper = last.toUpperCase();
      
     
      String middle = str.substring(1,size-1);
      
      String result = firstinLower+middle+lastinUpper;
      
    
      System.out.println("Updated string is: "+result);
   }
}