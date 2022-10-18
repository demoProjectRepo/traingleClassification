import java.util.*;

public class triangle {
	public static void main(String args[])
	{
		
		int s1 = 2 , s2 = 3 , s3 = 3 ;
		System.out.print("Enter the sides of a triangle :");
		
		if( s1 + s2 > s3 && s2+s3 > s1 && s1 + s3 > s2 && s1 > 0 && s2 > 0 && s3 > 0)
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
