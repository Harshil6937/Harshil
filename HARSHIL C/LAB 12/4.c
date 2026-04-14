#include<stdio.h>
#include<stdlib.h>

void main()
{
	int *ptr,n,i;
	int newsize;
	printf("Enter Size");
	scanf("%d",&n);
	
	ptr=(int *) malloc (n * sizeof(int));
	
	printf("Enter %d value\n",n);
	
	for(i=0;i<n;i++)
	{
		scanf("%d",(ptr+i));
	}
	printf("Value:");
	for(i=0;i<n;i++)
	{
		printf("%d\n",*(ptr+i));
	}
	printf("Enter New Size:");
	scanf("%d",&newsize);
	ptr=realloc(ptr,newsize);
	
	printf("Enter %d value\n",newsize);
	
	for(i=0;i<newsize;i++)
	{
		scanf("%d",(ptr+i));
	}
	printf("Values:\n");
	for(i=0;i<newsize;i++)
	{
		printf("%d\n",*(ptr+i));
	}
	free(ptr);
	}
