
public class Triangle {
public static void main(String[] args) {
	
	int a=15;
	int b=12;
	int c=15;
	
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

