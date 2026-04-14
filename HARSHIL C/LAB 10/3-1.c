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
	
	printf("Even Numbers:\n");
	for(i=0;i<n;i++)
	{
		if(*p[i]%2==0)
		printf("%d\n",*p[i]);
	}
	
	printf("Odd Numbers:\n");
	for(i=0;i<n;i++)
	{
		if(*p[i]%2!=0)
		printf("%d\n",*p[i]);
	}
}
