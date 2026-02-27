#include<stdio.h>
void main()
{
	int a,*p=&a;
	int b,*q=&b;
	int sum=0,*s=&sum;
	
	printf("Enter value of a:");
	scanf("%d",&a);
	
	printf("Enter value of b:");
	scanf("%d",&b);
	
	*s=*p+*q;
	
	printf("Sum=%d",*s);
}
