#include<stdio.h>
int rev(int);

void main()
{
	int n,ans;
	printf("Enter a number:");
	scanf("%d",&n);
	ans=rev(n);
	printf("%d",ans);
	
	if(n==ans)
			 printf("\nNumber is palindrome");
    else
    		 printf("\nNumber is not palindrome");
}

int rev(int n)
{
	int digit,ans=0;
	while(n!=0)
	{
		digit=n%10;
		ans=ans*10+digit;
		n=n/10;
	}
	return ans;
}
