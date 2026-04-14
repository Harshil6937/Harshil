#include<stdio.h>
void main()
{
	int i,n,res;
	
	printf("Enter N\n");
	scanf("%d",&n);
	
	for(i=1;i<=10;i++)
	{
		res=n*i;
		printf("%d*%d=%d\n",n,i,res);
	}
}
