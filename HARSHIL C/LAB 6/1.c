#include<stdio.h>
struct employee{
	char name[30];
	int id;
	float salary;
};

void main ()
{
	struct employee emp1;
	printf("Enter Name:");
	scanf("%s",emp1.name);
	printf("Enter ID:");
	scanf("%d",&emp1.id);
	printf("Enter Salary:");
	scanf("%f",&emp1.salary);
	printf("Details:\n");
	printf("Name:%s\n",emp1.name);
	printf("ID:%d\n",emp1.id);
	printf("Salary:%f",emp1.salary);
}
