import java.util.Scanner; //importing Scanner class package

public class triangle {
    static boolean test(int x, int y, int z){  //function to run test cases
        if(x<=0 || y<=0 || z<=0) return false; //incorrect if any side is zero or negative 
        else if(x+y<z || x+z<y || z+y<x) return false; //incorrect if sum of any two sides is less than the third side
        else return true; //correct in other cases
    }
    static void type(int x, int y, int z){ //function to display the type of triangle
        if(x==y && y==z && x==z) System.out.println("Equilatoral triangle"); //if all sides are equal
        else if(x!=y && y!=z && x!=z) System.out.println("Scalene triangle"); //if no sides are equal
        else System.out.println("Isosceles"); //else (if two sides are equal)
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating object sc of Scanner class
        System.out.println("Enter 3 sides: "); //taking user input (length of 3 sides of triangle)
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(test(x, y, z)) type(x, y, z); //if test case is true call the type function
        else System.out.println("Invalid input: "); //else run the code again and enter correct input
        sc.close();
    }
}

