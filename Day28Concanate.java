/*Day 29 coding Statement : Write a Program to concatenate a string.

Description

Get two strings as input from the user and then concatenate it.

Input

Enter first string

Hello

Enter second string

Hi

Output

HelloHi
import java.util.Scanner;
class String
{
public static void main(String[] args)
{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first string");
	 String str1=sc.nextLine();
	 System.out.println("Enter second string");
	String  str2=sc.nextLine();
	System.out.println("Concatenated string: "+(str1+str2));
}

}
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
         String str1 = sc.nextLine();
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();
       System.out.println("Concatenated string: "+(str1+str2));                   

       }

}