#include<stdio.h>
void main()
{
	int n,i;
	
	printf("Enter N:");
	scanf("%d",&n);

	int a[n+1];
	
	printf("Enter %d Number:",n);
	for(i=0;i<n;i++)
	{
	scanf("%d",&a[i]);
	}

	int value;
	
	printf("Enter New Value\n");
	scanf("%d",&value);
	
	for(i=n-1;i>=0 && a[i]>value;i--)
	{
		a[i+1]=a[i];	
	}	
	a[i+1]=value;
	
	printf("Sorted Array\t");
	
	for(i=0;i<n+1;i++)
	{
		printf("%d\t",a[i]);	
	}
	
	}
