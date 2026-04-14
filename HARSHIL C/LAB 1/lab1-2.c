#include<stdio.h>
void main()
{
	int i=1,n,ans=1;
	
	printf("Enter N\n");
	scanf("%d",&n);
	
	while(i<=n){
		ans=ans*i;
		i++;
	}
	printf("Factorial=%d",ans);
}
