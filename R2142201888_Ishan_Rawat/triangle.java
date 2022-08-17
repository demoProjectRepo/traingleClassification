import java.util.Scanner;

public class triangle {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the sides of the triangle");
		//The following varioables store the sides of the triangle
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		//The following if statement checks if the sides entered are greater than 0	
		if(a>0 && b>0 && c>0){
			//The following if statment checks if the sides entered satisfy the condition for them to be the sides of a triangle
			if(a+b>c || b+c>a || c+a>b) {
				//the following conditional statements check the type of triangle
				if(a==b && b==c)System.out.println("Triangle is equilateral");
				else if(a==b || b==c || c==a)System.out.println("Triangle is isosceles");
				else System.out.println("Triangle is scalene");
			}
			else System.out.println("Its not even a triangle");
		}
		else System.out.println("Please enter sides that are greater than 0");
	}
}
