#include<stdio.h>
#include<stdlib.h>
int main(){
    int s1=3,s2=3,s3=4;
    printf("Enter the sides of the triangle");
    //scanf("%d%d%d",&s1,&s2,&s3);
    if(s1==0 || s2==0 || s3==0){
        printf("Enter the sides again");
    }
    else if(s1==s2 && s2==s3){
        printf("The triangle is equilateral");
    }
    else if(s1==s2 || s2==s3 || s1==s3){
        printf("The triangle is an isosceles triangle");
    }
    else if(s1+s2 >s3 && s2+s3>s1 && s1+s3>s2)
    {
        printf("it is not a triangle");
    }
    else{
        printf("The triangle is scalene");
    }
    return 0;
}
