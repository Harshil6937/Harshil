#include<stdio.h>
void main()
{
	int a,*p;
	int b,*q;
	int temp;
	
	printf("Enter Value of A and B");
	scanf("%d %d",&a,&b);
	
	p=&a;//initialize
	q=&b;//initialize
	
	printf("Before A=%d,B=%d\n",a,b);
	
	temp=*p;
	*p=*q;
	*q=temp;
	
	printf("After A=%d,B=%d\n",a,b);
}
