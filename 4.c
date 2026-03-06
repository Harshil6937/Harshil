#include<stdio.h>
void main()
{
	int i,n,a[50],p[50];
	printf("Enter N:");
	scanf("%d",&n);
	 			   
	int *ptr = a;
	
	printf("Enter Elements:\n");
	
	for(i=0;i<n;i++)
	{
		scanf("%d",(ptr+i));
	}
	
	printf("Positive Numbers:\n");
	
	for(i=0;i<n;i++)
	{
		if(*(ptr+i)>0){
			printf(" %d",*(ptr+i));
		}
	 	
	}
	
	printf("\nNegative Numbers:\n");
	
	for(i=0;i<n;i++)
	{
		if(*(ptr+i)<0){
			printf(" %d",*(ptr+i));
		}
	}
}
