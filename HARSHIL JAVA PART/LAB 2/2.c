#include<stdio.h>
void circle (float);
void triangle (float,float);
void square (int);

void main()
{
	int choice;
	float r;
	float h,b;
	int s;
	printf("Enter Choice (1-Circle)(2-Triange)(3-Square)\n");
	scanf("%d",&choice);
	
	switch (choice)
	{
		case 1:
		
		printf("Enter R:");
		scanf("%f",&r);
		circle(r);
		
		case 2:
			
		printf("Enter Height");
		scanf("%f",&h);	
		printf("Enter Base");
		scanf("%f",&b);
		triangle(h,b);
		
		case 3:
		
		printf("Enter side:");
		scanf("%d",&s);
		square(s);	
	}
}

void circle(float r)
{
	float pi=3.14,ans;
	ans=pi*r*r;
	printf("Area of circle is %f",ans);
}

void triangle(float h,float b)
{
	float ans;
	ans=0.5*h*b;
	printf("Area Of Triangle is %f",ans);
}

void square(int s)
{
	float ans;
	ans=s*s;
	printf("Area Of Square is %f",ans);
}
