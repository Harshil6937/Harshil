#include<stdio.h>
void main()
{
	int m[3][3],i,j;
	int p,n,z;
	
	printf("Enter Matrix:\n");

	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("Enter [%d][%d]:",i,j);
			scanf("%d",&m[i][j]);
		}
	}

	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if(m[i][j]>0)
			{
				p++;
			}
			if(m[i][j]<0)
			{
				n++;
			}
			if(m[i][j]==0)
			{
				z++;
			}
		}
	}

	printf("Positive:%d\n",p);
	printf("Negative:%d\n",n);
	printf("Zero:%d\n",z);
}
