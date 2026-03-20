 #include<stdio.h>
 #include<stdlib.h>
 struct student 
 {
 	int roll;
 	char name[30];
 };
 
 void main()
 {
 	struct student *p;
 	p= (struct student *) malloc (sizeof(struct student *));
 	
 	printf("Enter Name:");
 	scanf("%s",p->name);
 	
 	printf("Enter Roll:");
 	scanf("%d",&p->roll);
 	
 	printf("Name=%s\n",p->name);
 	printf("Roll=%d\n",p->roll);
 	
 	free(p);
 }
 
