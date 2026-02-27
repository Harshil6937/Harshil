#include<stdio.h>
void main()
{
	int n,a[50];
	int *ptr=&a;
	int b[50];
	int*p=&b;
	int i;
	
	
	
	printf("ENTER N:");
	scanf("%d",&n);
	
	printf("Enter %d elements",n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}


	for(i=0;i<n;i++)
	{
		*(p+i)=*(ptr+i);
	}
	printf("copy array:");
	for(i=0;i<n;i++)
	{
		printf("%d\n",*(p+i));
	}
}
