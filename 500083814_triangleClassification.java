
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// first declare three variables of integer type for three side of a triangle 
		 int side1,side2,side3;
		 
		 System.out.println("Enter the first side of a triangle:");
		 // taking an input from user for First side by using scanner
		 Scanner obj =new Scanner(System.in);
		 side1=obj.nextInt();
		 
		 System.out.println("Enter the second side of a triangle:");
		 // taking an input from user for Second side by using scanner
		 Scanner obj1 =new Scanner(System.in);
		 side2=obj.nextInt();
		 
		 System.out.println("Enter the third side of a triangle:");
		 // taking an input from user for Third side by using scanner
		 Scanner obj2 =new Scanner(System.in);
		 side3=obj.nextInt();
		 
		 /* first condition shows that the sum of the two  sides of 
		 the triangle should be greater than the third side*/
		 if(side1+side2<=side3||side2+side3<=side1||side3+side1<=side2) {
			 System.out.println("This is not a triangle");
		 }
		 /*	this condition shows if all the sides of a triangle are
		 equal than it is called an equilateral triangle*/
		 else if(side1==side2&&side2==side3&&side3==side1) {
			 System.out.println("Triangle is equilateral");
		 }
		 /*this condition shows us that if any two sides are equal
		 to each other than the triangle is called an isoceleus triangle*/
		 else if(side1==side2||side2==side3||side3==side1) {
			 System.out.println("Triangle is isoceleus");
		 }
		 /*if above two  conditions are not satisfy then output will 
		 be the scalene triangle means none of the sides are equal to each other*/
		 else {
			 System.out.println("Triangle is scalene");
		 }
		}
		 
	}

