#include<stdio.h>
void main()
{
	int m,n;
	int a[100][100],b[100][100],c[100][100];
	int *p[100][100];
	int *q[100][100];
	int *r[100][100];
	int i,j;

	printf("Enter M:");
	scanf("%d",&m);

	printf("Enter N:");
	scanf("%d",&n);
	
	
	printf("Enter Matrix-1");
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			scanf("%d",&a[i][j]);
			p[i][j] = &a[i][j];
		}
	}
	
   printf("%d",*p[0][0]);
	
	printf("Enter Matrix-2");
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			scanf("%d",&b[i][j]);
			q[i][j] = &b[i][j];
		}
	}
	
	for(j=0;j<m;j++)
	{
		for(i=0;i<n;i++)
		{
			c[i][j]=*p[i][j]+*q[i][j];
			r[i][j] = &c[i][j];
		}
	}
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			printf("%d \t",*r[i][j]);
		}
		printf("\n");
	}
}
