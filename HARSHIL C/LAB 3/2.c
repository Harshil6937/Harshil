//2. Find the maximum number between two numbers using a function. (A)  
#include<stdio.h>
void max(int,int);

void main()
{
    int a,b;
	printf("Enter a:");
	scanf("%d",&a);
	
	printf("Enter b:");
	scanf("%d",&b);
	max(a,b);
}

void max(int a,int b)
{
	if(a>b)
	{
		printf("A is maximum");
	}
	else
	{
	 printf("B is maximum");	
	}	
}
