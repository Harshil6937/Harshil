#include<stdio.h>
void main()
{
	int a,*p;
	float b,*q;
	double c,*z;
	char d,*r;
	
	p=&a;
	q=&b;
	r=&c;
	z=&d;
	
	printf("Enter Value of INT:");
	scanf("%d",&a);
	
	printf("Enter Value of FLOAT:");
	scanf("%f",&b);

	printf("Enter Value of doyble:");
	scanf("%lf",&c);
	
	printf("Enter Value of char:");
	scanf("%c",&d);
	
	printf("Value of A=%d,Address of a=%u\n",*p,&a);
	printf("Value of B=%f,Address of a=%u\n",*q,&b);
	printf("Value of C=%c,Address of a=%u\n",*r,&c);
	printf("Value of D=%lf,Address of a=%u\n",*z,&d);
}
