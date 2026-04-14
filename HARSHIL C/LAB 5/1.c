#include<stdio.h>
int fact(int);

void main()
{
 	 int n,ans;
 	 printf("Enter N:");
 	 scanf("%d",&n);
 	 ans=fact(n);
 	 printf("%d",ans);
}

int fact(int n)
{
	int f;
	if(n==1)
			return 1;
	else
		return f=n*fact(n-1);
}
