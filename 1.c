#include<stdio.h>
void main()
{
	int a,*p=&a;
	//p=&a;
	
	printf("Enter Value of a:");
	scanf("%d",&a);
	
	printf("Value of A=%d\n",*p);
	
	printf("Address of A=%u",p);
}
