#include<stdio.h>
void main()
{
	 char str[100],str1[100];
	 char *p,*q;
	 
	 p=&str;
	 q=&str1;
	 
	 printf("Enter String:");
	 gets(str);
	 
	 while(*p!='\0')
	 {
	 	*q=*p;
	 	q++;
	 	p++;
	 }
	 
	 printf("Copied string:");
	 puts(str1);
}
