#include<stdio.h>
void main()
{
	int i,j,n,a[50],*p[50],temp;
	
	printf("Enter n:\n");
	scanf("%d",&n);
	
	printf("Enter Value\n");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
		p[i]=&a[i];
	}
	
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
		if(*p[i]>*p[j])
			{
			temp=*p[i];
			*p[i]=*p[j];
			*p[j]=temp;
			}
		}
	}
	
	printf("Sort:\n");
	for(i=0;i<n;i++)
	{
		printf("%d\n",*p[i]);
	}
	}

