/*Day 16 coding Statement : Write a program to identify if the number is Armstrong number or not
Description:
Get an input number from user and check whether the given number is an Armstrong number or not.
E.g. Let the number be 1634,
Here 1^4 + 6^4 + 3 ^4 + 4^4 = 1634
Therefore, this is an Armstrong number
Input:153
Output
Armstrong number
Input:121
Output:Not an Armstrong number*/

import java.util.Scanner;
class Armstrong
{
public static void main(String[] args)
 {     Scanner sc=new Scanner(System.in);
 System.out.println("Entre any Number");
       int num = sc.nextInt();
	   int originalNum, remainder, result = 0;
        originalNum = num;
        while (originalNum != 0)
         {
             remainder = originalNum % 10;
             result += Math.pow(remainder, 3);
             originalNum /= 10;
         }   
	 if(result == num) 
		 System.out.println(num + " is an Armstrong number.");
       else
          System.out.println(num + " is not an Armstrong number.");
        }
    }