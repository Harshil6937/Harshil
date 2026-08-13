#include<stdio.h>
void main()
{
	int m1[100][100],m2[100][100],m3[100][100];
	int m,n,i,j,k;
	
	printf("Enter M:");
	scanf("%d",&m);
	
	printf("Enter N:");
	scanf("%d",&n);
	
	printf("Enter Matrix-1\n");
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("Enter [%d][%d]",i,j);
			scanf("%d",&m1[i][j]);
		}
	}
	
	printf("Enter Matrix-2\n");
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("Enter [%d][%d]",i,j);
			scanf("%d",&m2[i][j]);
		}
	}
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			for(k=0;k<n;k++)
			{
			m3[i][j]=m1[i][k]*m2[k][j];
			}
		}
	}
	
	printf("After Multiplication:\n");
	
	for(i=0;i<m;i++)
	{
		
		for(j=0;j<n;j++)
		{
			printf("%d\t",m3[i][j]);
		}
		printf("\n");
	}
	
}
