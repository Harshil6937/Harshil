#include<stdio.h>
void main()
{
	int a,*p;
	float b,*q;
	double c,*r;
	char d,*s;
	
	p=&a;
	q=&b;
	r=&c;
	s=&d;
	
	printf("Enter value of int:");
	scanf("%d",&a);
	printf("Enter value of float:");
	scanf("%f",&b);
	printf("Enter value of double:");
	scanf("%lf",&c);
	printf("Enter value of char:");
	scanf("%s",&d);
	
	printf("INT-Value=%d,Address=%u\n",*p,p);
	printf("FLOAT-Value=%f,Address=%u\n",*q,q);
	printf("DOUBLE-Value=%lf,Address=%u\n",*r,r);
	printf("CHAR-Value=%c,Address=%u\n",*s,s);
}
