#include<stdio.h>
int power(int,int);

void main()
{
	int x,y,ans;
	
	printf("Enter x:");
	scanf("%d",&x);
	printf("Enter y:");
	scanf("%d",&y);
	
	ans=power(x,y);
	printf("%d",ans);
}

int power(int x,int y)
{
	if(y==0)
			return 1;
	else
		return x*power(x,y-1);
x`}
