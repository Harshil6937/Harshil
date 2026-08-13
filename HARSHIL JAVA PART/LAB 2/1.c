#include<stdio.h>
void fibbo (int);

void main()
{
	int n;
	
	printf("Enter N:");
	scanf("%d",&n);
	
	fibbo(n);
}
void fibbo (int n) 
{
	int i,a=0,b=1,c;
	
	for(i=0;i<n;i++)
	{
		printf("%d",a);
		c=a+b;
		a=b;
		b=c;
	}
}
