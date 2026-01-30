#include<stdio.h>
struct person
{
	char name[30];
	int age;
};
struct student
{
	int roll;
	float marks;
	struct person p;
};

void main()
{	
	struct student s1;
printf("Enter Name");
scanf("%s",s1.p.name);
printf("Enter Age");
scanf("%d",&s1.p.age);
printf("Enter Roll no");
scanf("%d",&s1.roll);
printf("Enter Marks");
scanf("%f",&s1.marks);
printf("Details\n");
printf("Name:%s\n",s1.p.name);
printf("Age:%d\n",s1.p.age);
printf("Roll:%d\n",s1.roll);
printf("Marks:%f",s1.marks);
}
