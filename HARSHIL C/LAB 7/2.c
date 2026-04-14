#include<stdio.h>

struct student{
	char name[50];
	float per;
	int age;
};

  	void main(){
	
	struct student s[100];
	int i,n,max_index;
	float max;
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

 	for(i=0;i<n;i++)
 	{
 	 	max=s[0].per;
 	 	if(max<s[i].per)
 	 	{
 	 		max=s[i].per;
 	 		max_index=i;
		  }
    }
   printf("Highest Percentage Student Details:\n");
   printf("Name:%s\n",s[max_index].name);
   printf("Per:%f%\n",s[max_index].per);
   printf("Age:%d\n",s[max_index].age);
}

