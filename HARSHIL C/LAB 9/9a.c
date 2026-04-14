#include<stdio.h>
void main()
{
	int a,*p;
	p=&a;
	 
	printf("Enter Num=");
	scanf("%d",&a);
	
	printf("Number is %d\n",*p);
	printf("Address is %d\n",p);
	
}
