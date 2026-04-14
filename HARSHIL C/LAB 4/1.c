#include<stdio.h>
float max(float,float,float);
void main()
{
	float a,b,c;
	float ans;
	printf("Enter A:");
	scanf("%f",&a);
	
	printf("Enter B:");
	scanf("%f",&b);
	
	printf("Enter C:");
	scanf("%f",&c);

	ans=max(a,b,c);
	printf("%f is maximum",ans);
}

float max(float a,float b,float c)
{
	if(a>b)
	{
		if(a>c)
		{
			return a;
		}
		else
		{
			return c;
		}
	}
	else
	{
		if(b>c)
		{
		 return b;
 		}
		else
		{
		return c;		
		}
	}
}
