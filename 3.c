#include<stdio.h>
#include<string.h>
struct student{
	char name[50];
	float per;
	int age;
};

  	void main(){
	
	struct student s[100];
	int i,j,n;
	
	printf("Enter n:");
	scanf("%d",&n);
	
	for(i=0;i<n;i++)
{
	printf("Enter Data For %d student\n",i+1);
	printf("Enter Name:");
	scanf("%s",s[i].name);
	printf("Enter Percentage:");
	scanf("%f",&s[i].per);
	printf("Enter Age:");
	scanf("%d",&s[i].age);
}

for(i=0;i<n-1;i++)
{
	for(j=i+1;j<n;j++)
	{
		if( strcmp(s[i].name,s[j].name) > 0)
			{
			struct student temp=s[i];
			s[i]=s[j];
			s[j]=temp;
			}
		}
	}
 printf("Data in alphabetic order");
	for(i=0;i<n;i++)
	{
	printf("name=%s\n",s[i].name);
	printf("per=%f%\n",s[i].per);
	printf("Age=%d\n",s[i].age);
	}
}



