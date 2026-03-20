#include<stdio.h>
#include<stdlib.h>

void main()
{
	int *ptr,n,i,sum=0;
	
	printf("Enter Value of n\n");
	scanf("%d",&n);
	
	ptr=(int *) malloc (n * sizeof(int));
	
	printf("Enter %d value\n",n);
	
	for(i=0;i<n;i++)
	{
		scanf("%d",(ptr+i));
		sum=sum+*(ptr+i);
	}
	
	printf("Sum=%d",sum);
	
	free(ptr);
}
