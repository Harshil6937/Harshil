#include<stdio.h>
#include<string.h>
void main()
{

	char str[100];
	
	int i,len=0;
	
	printf("Enter String");
	gets(str);
	
	char *p = str;
	while(*p!='\0')
	{
		len++;
		p++;
	}
	
	printf("Length=%d",len);
}
