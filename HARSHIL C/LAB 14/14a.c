#include<stdio.h>
void main()
{
	FILE *fp;
	fp = fopen("hii.txt","w");
	
	if (fp == NULL)
	{
		printf("File not created\n");
	}
	
	printf("File created\n");
	
	fclose(fp);
}
