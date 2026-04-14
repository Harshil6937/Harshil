//Pass an array in a function to print the array elements.
#include<stdio.h>
int print(int a[],int n);

void main()
{
	int a[100],i,n,ans;
	printf("Enter n:");
	scanf("%d",&n);
	printf("Enter %d elements\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	print(a,n);
}

int print(int a[],int n)
{
	int i;
	printf("Entered elements are:\n");
	for(i=0;i<n;i++)
	{
		printf("%d\n",a[i]);
	}
}
