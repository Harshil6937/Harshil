#include<stdio.h>
int rev(int n);
void main()
{
	int n,ans;
	printf("Enter n:");
	scanf("%d",&n);
	ans=rev(n);
 	printf("%d",ans);
}

int rev(int n)
{	int digit,r;
	if(n==1)
			return 1;
	else 
		 	while(n!=0)
		 	{
			 digit=n%10;
			 r=r*10+digit;
			 n=n/10;
			 }
			 return r;
}
