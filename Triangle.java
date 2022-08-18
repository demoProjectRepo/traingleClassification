public class Triangle {
public static void main(String[] args) {
	
	int a=18;
	int b=13;
	int c=9;
	
	if(a+b>c) {
		System.out.println(" Valid triangle");
		
		System.out.println("-----------------------------------");
		
		if(a==b && b==c) {
			System.out.println(" Equilateral");
		}
		else if(a==b || b==c || c==a) {
			System.out.println(" Isosceles");
		}
		else {
			System.out.println("Scalene");
		}
	}
	else {
		System.out.println(" Invalid Triangle.");
	}
}
}
