#include<stdio.h>
void main()
{
	int n,a[50],*ptr[50];
	int i;
	int b[50],*p[50];
	
	printf("Enter N");
	scanf("%d",&n);
	
	printf("Enter Value of 1 array");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		ptr[i]=&a[i];
	}
	
	printf("Enter Value of 2 array");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&b[i]);
		p[i]=&b[i];
	}
	
	for(i=0;i<n;i++)
	{
		int temp;
		temp=*ptr[i];
		*ptr[i]=*p[i];
		*p[i]=temp;
	}
	
	printf("After Swap:");
	printf("First Array");
	for(i=0;i<n;i++)
	{
	printf("%d\n",*ptr[i]);		
	}
	
	printf("Second Array");
	
	for(i=0;i<n;i++)
	{
	printf("%d\n",*p[i]);	
	}
	
}
