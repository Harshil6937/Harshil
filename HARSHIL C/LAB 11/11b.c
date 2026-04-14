#include<stdio.h>
void main()
{
	int a[100][100];
	int *p[100][100];
	int i,j,m,n;
	
	printf("Enter M:");
	scanf("%d",&m);
	
	printf("Enter N:");
	scanf("%d",&n);
	
	printf("Enter 1-Matrix\n");
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			scanf("%d",&a[i][j]);
			p[i][j]=&a[i][j];
		}
	}
	
	printf("Sum Of Columns:\n");
	
	for(j=0;j<n;j++)
	{
		int sum=0;
		for(i=0;i<m;i++)
		{
			sum=sum+*p[i][j];
		}
		printf("Sum:%d\n",sum);
	}
}
