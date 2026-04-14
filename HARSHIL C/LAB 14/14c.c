#include<stdio.h>
void main()
{
	FILE *fp;
	char ch;
	int c=0,s=0,t=0,l=0;
	fp= fopen("hii.txt","r");
	
	while((ch = fgetc(fp)) != EOF)
	{
		c++;
		
		if(ch == ' ')
		s++;
		
		if(ch == '\t')
		t++;
		
		if(ch == '\n')
		l++; 
	}
	
	printf("Characters: %d\nSpaces: %d\nTabs: %d\nLines: %d\n",
            c, s, t, l);
            
          fclose(fp);  
}
