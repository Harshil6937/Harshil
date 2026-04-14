#include<stdio.h>
void main()
{
	int n,i;
	int a[50],*p[50];
	
	printf("Enter N:");
	scanf("%d",&n);
	
	printf("Enter %d Number",n);
	
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		p[i]=&a[i];//Initialize
	}
	
	printf("Array:");
	
	for(i=0;i<n;i++)
	{
		printf("%d  \t",*p[i]);
		
	}
}
