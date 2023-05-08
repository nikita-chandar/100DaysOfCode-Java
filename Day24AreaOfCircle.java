/*Day 22 coding Statement : Write a program to find Area of a circle
Description
Get the value for radius from the user and calculate the area of the circle for the given radius.
Area of circle = 3.14*radius*radius
Input
3

Output
28.26

 */
 
 import java.util.Scanner;
 class AreaOfCircle{
	 
	 public static void main(String a[])
	 {
		 Scanner sc=new Scanner(System.in);
		 float AreaOfCircle=0;
		 float pie=3.14f;
		 System.out.println("Enter any Number");
		 float radius=sc.nextInt();
		 AreaOfCircle = pie*radius*radius;
		 System.out.println(AreaOfCircle);
		 
		 
	 }
 }