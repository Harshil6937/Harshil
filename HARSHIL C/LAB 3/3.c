//3. Count simple interest using a function. (A)  

#include<stdio.h>

void si(float,float,float);

void main()
{
	int p,r,t;
	printf("Enter p:");
	scanf("%f",&p);
	
	printf("Enter r:");
	scanf("%f",&r);
	
	
	printf("Enter t:");
	scanf("%f",&t);
	
	si(p,r,t);
}

void si(float p,float r,float t)
{
	float ans=0;
	ans=p*r*t / 100;
	printf("Interest is %f",ans);
}
