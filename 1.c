// Create structure student with name, percentage and age. Read data of 5 students using array of structure. (A) 

#include<stdio.h>

struct student{
	char name[50];
	float per;
	int age;
};

  	void main(){
	
	struct student s[5];
	int i;

	for(i=0;i<5;i++)
{
	printf("Enter Data For %d student\n",i+1);
	printf("Enter Name:");
	scanf("%s",s[i].name);
	printf("Enter Percentage:");
	scanf("%f",&s[i].per);
	printf("Enter Age:");
	scanf("%d",&s[i].age);
}

 	for(i=0;i<5;i++)
	{
	printf("Data For %d student\n",i+1);
	printf("name=%s\n",s[i].name);
	printf("per=%f%\n",s[i].per);
	printf("Age=%d\n",s[i].age);
	}

}

