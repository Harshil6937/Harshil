#include<stdio.h>
#include<stdlib.h>
void main()
{
	int *ptr,n,i;
	float *fptr;
	char *cptr;
	
	printf("Enter N:");
	scanf("%d",&n);
	
	ptr=(int *) malloc (n * sizeof(int));
	fptr=(float *) malloc (n * sizeof(float));
	cptr=(char *) malloc (n * sizeof(char));
	
	if(ptr!= '\0' && fptr!='\0' && cptr!='\0' )
	{
		printf("Memory Allocated Succesfully:\n");
	}
	
	*ptr=25;
	*fptr=7.77;
	*cptr='H';
	
	printf("Integer:%d\n",*ptr);
	printf("Float:%f\n",*fptr);
	printf("Char:%c\n",*cptr);
	
	free(ptr);
	free(fptr);
	free(cptr);

}
