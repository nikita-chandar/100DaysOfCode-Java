/*Day 31 coding Statement : Write a Program to Toggle each character in a string

Description
Get an input string from user and then convert the lower case of alphabets to upper case and all upper-case alphabets into lower case.

Input
Hello

Output
hELLO*/

import java.util.Scanner;
public class Main
 {
  public static void main(String[] args) 
  
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a String : ");
       String str = sc.nextLine();    
       String s = "";
       for (int i = 0; i < str.length(); i++) {        
		 if(Character.isUpperCase(str.charAt(i)))
           s=s+Character.toLowerCase(str.charAt(i));    

              else  
			  {
				  s=s+Character.toUpperCase(str.charAt(i));
			  }
 }
       System.out.println("Toggle  a String : "+s);                     

    
  }                                        
}
                            

                                            

             

              

               
          


  

