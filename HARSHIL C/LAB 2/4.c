#include<stdio.h>
void main()
{
	char str[50],rev_str[50];
	int i,len=0,j=0;
	
	printf("Enter a string:");
	
	gets(str);
 	
 	for(i=0;str[i]!='\0';i++)
 	{
 		len++;
	}
	
	for(i=len-1;i>=0;i--)
	{
		rev_str[j++]=str[i];
	}
	rev_str[j]='\0';
	printf("Reverse String:");
	puts(rev_str);
}
