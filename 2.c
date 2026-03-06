#include<stdio.h>
void main()
{
	int i,n,a[50],*p[50];
	
	printf("Enter n:");
	scanf("%d",&n);
	
	printf("Enter Value\n");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		p[i]=&a[i];
	}
	
	printf("Entered Array Is:\n");
	
	for(i=0;i<n;i++)
	{
		printf("%d\n",*p[i]);
	}
}
