import java.util.Scanner;

public class TriangleClassification_500083151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter first side of a triangle");
	       int a = sc.nextInt();
	       System.out.println("Enter second side of a triangle");
	       int b = sc.nextInt();
	       System.out.println("Enter third side of a triangle");
	       int c = sc.nextInt();
	       if(a==b && b==c) {
	    	   System.out.println("Equilateral triangle");
	       }
	       else if((a==b && b!=c) || (a!=b && b==c)) {
	    	   System.out.println("Isosceles triangle");
	       }
	       else {
	    	   System.out.println("Scalene triangle");
	       }
	    	   

	}

}
