#include<stdio.h>
void main()
{
	int n,a[50],*ptr[50];
	int i;
	int b[50],*p[50];
	
	// &a[i]    [1000][1004][1008]
	// int*ptr[3]  1000 1004  1008
	
	// &b[i]    [1000][1004][1008]
	// int*p[3]   
	
	printf("Enter N");
	scanf("%d",&n);
	
	printf("Enter Value of 1 array");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		ptr[i]=&a[i];
	}
	
	
	for(i=0;i<n;i++)
	{
		p[i]=ptr[i];
	}
	printf("Copy array");
	for(i=0;i<n;i++)
	{
		printf("%d",*p[i]);
	}
	
}
