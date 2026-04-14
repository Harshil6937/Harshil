#include<stdio.h>
void main()
{
	int a[15],*p[15];
	int b[15],*q[15];
	int i,n;
	
	printf("Enter N:");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		p[i]=&a[i];
	}
	
	for(i=0;i<n;i++)
	{
		q[i]=p[i];
	}
	for(i=0;i<n;i++)
	{
		printf("%d\n",*q[i]);
	}
}
