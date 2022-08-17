#include<stdio.h>

int main (){

  int side1, side2, side3;

  printf ("Enter the sides of triangle:");
  scanf ("%d%d%d", &side1, &side2, &side3);

  if (side1 > 0 && side2 > 0 && side3 > 0)
    {
      if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2)
	  {
	      if (side1 == side2 && side2 == side3)
	    printf ("The Given Triangle is equilateral\n");

	      else if (side1 == side2 || side2 == side3 || side3 == side1)
	    printf ("The given Triangle is isosceles\n");

	      else
	    printf ("The given Triangle is scalene\n");
	  }
    }

  else
    {
      printf ("It is an invalid triangle");
    }
  return 0;
}
