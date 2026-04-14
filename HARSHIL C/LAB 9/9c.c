#include<stdio.h>
void main()
{
	int a,*p;
	int b,*q;
	int sum=0;
	
	p=&a;
	q=&b;
	
	printf("Enter A:");
	scanf("%d",&a);

	printf("Enter B:");
	scanf("%d",&b);
	
	sum= *p + *q;
	
	printf("SUM=%d",sum);
}
