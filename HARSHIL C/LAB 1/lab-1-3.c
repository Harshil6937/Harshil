#include<stdio.h>
void main()
{
	int i,n,flag=0;
	
	printf("Enter N\n");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		if(n%i==0)
  		flag++;
	}
	if(flag==2)
			   printf("Number is prime");
    else
    		   printf("Number is not prime");
}
