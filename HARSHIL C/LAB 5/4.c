#include<stdio.h>
int swap(int a[],int b[],int n);

void main()
{
	int a[200],b[200],n,i;
	printf("Enter n:");
	scanf("%d",&n);
	printf("Enter %d elements for first array:\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("Enter %d elements for second array:\n",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&b[i]);
	}
	swap(a,b,n);
	printf("Elements of first array\n");
	for(i=0;i<n;i++)
	{
		printf("%d\n",a[i]);
	}
	printf("Elements of second array\n");
	for(i=0;i<n;i++)
	{
		printf("%d\n",b[i]);
	}
}

int swap(int a[],int b[],int n)
{
	int i,temp;
	for(i=0;i<n;i++)
	{
		temp=a[i];
		a[i]=b[i];
		b[i]=temp;
	}
}
