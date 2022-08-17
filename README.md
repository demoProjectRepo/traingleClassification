# traingleClassification
Classify a triangle based on length of three sides
Input will be three integers

⚡️a ,c ,d is representing the side. of triangle 

⚡️Equilateral Triangle: A triangle is said to be equilateral triangle if all the sides are equal. If a, b, c are three sides of the triangle. Then, the triangle is equilateral only if A = B = C.

⚡️Isosceles Triangle: A triangle is said to be an isosceles triangle if any of its two sides are equal. If a ,b ,c are three sides of the triangle.Then, the triangle is isosceles if either a = b or a =c  or b = c.

⚡️Scalene Triangle: A triangle is said Scalene Triangle if none of its sides is equal .

⚡️There is two more condition to be verified to avoide any errors in the program.
  1.  The first is that input should be in +ve Intergers or decimals. 
      for this we use try and catch function any input other than number will result in error and will be identified by catch function  
  2.  The second but most important to check that the sum of any two side should be greater then the third side otherwise the triangle will not be formed 
      for the we use **"if(a<=0 || b<=0 || c<=0)"**. statement 
