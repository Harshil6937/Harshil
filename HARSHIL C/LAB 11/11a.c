#include<stdio.h>
void main()
{
	int a[100][100],b[100][100],c[100][100];
	int *p[100][100];
	int *q[100][100];
	int *r[100][100];
	int m,n,i,j;

	printf("Enter M:");
	scanf("%d",&m);
	
	printf("Enter N:");
	scanf("%d",&n);
	
	printf("Enter 1-Matrix\n");
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			scanf("%d",&a[i][j]);
			p[i][j]=&a[i][j];
		}
	}
	
	printf("Enter 2-Matrix\n");
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			scanf("%d",&b[i][j]);
			q[i][j]=&b[i][j];
		}
	}
	
	for(j=0;j<m;j++)
	{
		for(i=0;i<n;i++)
		{
			c[i][j]=*p[i][j]+*q[i][j];
			r[i][j]=&c[i][j];
		}
	}
	
	printf("ADDITION:\n");
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			printf("%d   ",*r[i][j]);
		}
		printf("\n");
	}
}
