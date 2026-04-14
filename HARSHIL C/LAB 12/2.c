#include<stdio.h>
#include<stdlib.h>
void main()
{
	int a[50],*p;
	int sum=0,n,i;
	
	printf("Enter N:");
	scanf("%d",&n);
	
	p=(int *) malloc (n * sizeof(int));
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		p=&a[i];
		sum=sum+*p;
	}
	
	printf("Sum=%d",sum);
	
	free(p);
}
