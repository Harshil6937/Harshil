#include<stdio.h>

void add(int,int);

void main()
{
	int a,b;
	printf("Enter a:");
	scanf("%d",&a);
	printf("Enter b:");
	scanf("%d",&b);
	add(a,b);

}

void add(int a,int b)
{
	int sum=0;
	sum=a+b;
	printf("\nTotal is %d",sum);
}
