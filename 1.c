#include<stdio.h>
void main()
{
	int a,b;
	int *p,*q;
	p=&a;
	q=&b;
	
	printf("Enter A:");
	scanf("%d",&a);
	
	printf("Enter B:");
	scanf("%d",&b);
	
	printf("Before:A=%d,B=%d\n",a,b);

	int temp;
	temp=*p;
	*p=*q;
	*q=temp;
	
	printf("After:A=%d,B=%d\n",a,b);
}
