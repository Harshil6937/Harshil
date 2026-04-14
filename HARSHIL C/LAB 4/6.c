#include<stdio.h>
void prime(int);

void main()
{
	int n,m,ans=0,i;
	printf("Enter Starting Point:");
	scanf("%d",&n);
	printf("Enter Ending Point:");
	scanf("%d",&m);
	for(i = n; i <=m; i++)
	{
	prime(i);
	}
}

void prime(int num)
{
	int i,count=0;
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}
 	
	}
	if(count == 2){
		printf("\n%d is prime number",num);
	}
}
