import java.util.*;

public class triangle {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int s1 = 0 , s2 = 0 , s3 = 0 ;
		System.out.print("Enter the sides of a triangle :");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		if( s1 + s2 > s3 && s2+s3 > s1 && s1 + s3 > s2 )
		{
		if( s1 == s2 && s2 == s3)
		{
			System.out.println("The triange is equilateral ");
		}
		if( s1 != s2 && s2 != s3 && s1 != s3)
		{
			System.out.println("The triange is scaler");
		}
		else
		{
			System.out.println("The triange is isoceles");
		}
		}
		else
		{
			System.out.println("This is not a triangle");
		}
		
	}

}
