#include<stdio.h>
void main()
{
	int a[100],n;
	int i,even=0,odd=0;
	
	printf("Enter Size Of Array:");
	scanf("%d",&n);
	
	printf("Enter %d Number\n",n);
	
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
	for(i=0;i<n;i++)
	{
		if(a[i]%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
	}
	
	printf("Even Number:%d\n",even);
	printf("Odd Number:%d\n",odd);
}
