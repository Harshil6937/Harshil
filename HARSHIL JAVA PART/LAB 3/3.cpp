#include<stdio.h>
void main()
{
	int n,i;
	
	printf("Enter N:");
	scanf("%d",&n);

	int a[n];
	
	for(i=0;i<n;i++)
	{
	printf("Enter %d Number:");
	scanf("%d",&a[i]);
	}

	int value;
	
	printf("Enter New Value");
	scanf("%d",&value);
	
	for(i=n-1;i>=0 && a[i]>value;i--)
	{
		a[i+1]=a[i];	
	}	
	a[i]=value;
	
	printf("Sorted Array");
	
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);	
	}
	
	}
