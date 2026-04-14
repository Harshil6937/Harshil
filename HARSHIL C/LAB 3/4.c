#include<stdio.h>
void fibbo (int n);

void main()
{
    int n,i=0;
	printf("enter n");
	scanf("%d ",&n);
	
	fibbo(n);
}
void fibbo(int n)
{
	int a=0,b=1,i,c;
	for (i=0;i<n;i++)
	{
		if(i==0)
		{
			printf("%d",a);
		}
		if(i==1)
		{
			printf("%d",b);
		}
		else
		{
			c=a+b;
			printf(" %d",c);
			a=b;
			b=c;
			c=a;
		}
		
	}
	
}
