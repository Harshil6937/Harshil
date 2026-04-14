#include<stdio.h>
void main()
{
	int n,digit,rev=0;
	
	printf("Enter N:");
	scanf("%d",&n);
	
	while(n!=0)
	{
		digit=n%10;
		rev=rev*10+digit;
		n=n/10;
	}
	printf("rev=%d",rev);
	
}
