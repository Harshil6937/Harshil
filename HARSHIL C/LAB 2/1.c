#include<stdio.h>
void main()
{
	int num[50],i,j,n,temp;
	
	printf("Enter N:");
	scanf("%d",&n);
	
	printf("Enter %d number",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&num[i]);
	}
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(num[j]<num[j+1])
			{
				temp=num[j];
				num[j]=num[j+1];
				num[j+1]=temp;
			}
		}
	}
	printf("Ascending Order:");
	for(i=0;i<n;i++)
	{
		printf("%d",num[i]);
	}#include<stdio.h>
void main()
{
	int num[50],i,j,n,temp;
	
	printf("Enter N:");
	scanf("%d",&n);
	
	printf("Enter %d number",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&num[i]);
	}
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(num[i]>num[j])
			{
				temp=num[j];
				num[j]=num[i];
				num[i]=temp;
			}
		}
	}
	printf("Ascending Order:");
	for(i=0;i<n;i++)
	{
		printf("%d",num[i]);
	}
}
