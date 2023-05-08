/*Day 42*Example: Compute Sum and Average of Array Elements*/

import java.util.*;
class Array
 {
 public static void main(String[] args) 
 {

   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
   int sum = 0;
   Double average;
   
   for (int number: numbers)
	 {
           sum += number;
      }
  
   // get the total number of elements
   int arrayLength = numbers.length;

   // convert the average from int to double
   average =  ((double)sum / (double)arrayLength);

   System.out.println("Sum = " + sum);
   System.out.println("Average = " + average);
 }

 }