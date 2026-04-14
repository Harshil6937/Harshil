#include<stdio.h>
void main()
{
	char str[50],str1[50];
	int i;
	
	printf("Enter a string:");
	gets(str);
	
	for(i=0;str[i]!='\0';i++)
	{
		str1[i]=str[i];
	}
	printf("Copied string:");
	puts(str1);
}
