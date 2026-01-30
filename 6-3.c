#include<stdio.h>
struct student{
	char name[30];
	int id; 
};

union employee{
	char name[30];
	int id;
};

void main()
{
	struct student s1;
	union employee e1;
	printf("Student:\n");
	printf("Enter Name:");
	scanf("%s",s1.name);
	printf("Enter ID:");
	scanf("%d",&s1.id);
	printf("Union:\njsdl");
	printf("Enter Name:");
	scanf("%s",e1.name);
	printf("Enter ID:");
	scanf("%d",&e1.id);
	
	printf("Structure:");
	printf("Name:%s\n",s1.name);
	printf("ID:%d\n",s1.id);
	printf("Union:");
	printf("Name:%s\n",e1.name);
	printf("ID:%d\n",e1.id);
	
}
