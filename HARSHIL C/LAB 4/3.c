#include<stdio.h>
void swap(int *,int *);

void main()
{
	int a,b;
	printf("Enter a:");
	scanf("%d",&a);
	
	printf("Enter b:");
	scanf("%d",&b);
	
	printf("Before Swapping Value of a=%d,b=%d",a,b);
	swap(&a,&b);
	printf("\nAfter Swapping Value of a=%d,b=%d",a,b);
}

void swap(int *a,int *b)
{
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
}
