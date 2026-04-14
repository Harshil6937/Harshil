#include<stdio.h>
void main()
{
	int n,digit;
	
	printf("Enter Number:");
	scanf("%d",&n);
	
	while(n!=0)
	{
		digit=n%10;
		printf("%d",digit);
		n=n/10;
	}
}
