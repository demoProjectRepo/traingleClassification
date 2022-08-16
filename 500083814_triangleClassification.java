
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		 int side1,side2,side3;
		 System.out.println("Enter the first side of a triangle:");
		 Scanner obj =new Scanner(System.in);
		 side1=obj.nextInt();
		 
		 System.out.println("Enter the second side of a triangle:");
		 Scanner obj1 =new Scanner(System.in);
		 side2=obj.nextInt();
		 
		 System.out.println("Enter the third side of a triangle:");
		 Scanner obj2 =new Scanner(System.in);
		 side3=obj.nextInt();
		 
		 if(side1+side2<=side3||side2+side3<=side1||side3+side1<=side2) {
			 System.out.println("This is not a triangle");
		 }
		 else if(side1==side2&&side2==side3&&side3==side1) {
			 System.out.println("Triangle is equilateral");
		 }
		 else if(side1==side2||side2==side3||side3==side1) {
			 System.out.println("Triangle is isoceleus");
		 }
		 else {
			 System.out.println("Triangle is scalene");
		 }
		}
		 
	}

