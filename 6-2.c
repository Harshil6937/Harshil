#include<stdio.h>
struct Book{
	char title[20];
	char author[20];
	char publication[20];
	int price;
};

void main()
{
	struct Book b1,b2,b3;
	printf("Enter Details for 1st Book\n");
	printf("Enter Title:");
	scanf("%s",b1.title);
	printf("Enter Author:");
	scanf("%s",b1.author);
	printf("Enter Publication:");
	scanf("%s",b1.publication);
	printf("Enter Price:");
	scanf("%d",&b1.price);
	printf("Enter Details for 2nd Book\n");
	printf("Enter Title:");
	scanf("%s",b2.title);
	printf("Enter Author:");
	scanf("%s",b2.author);
	printf("Enter Publication:");
	scanf("%s",b2.publication);
	printf("Enter Price:");
	scanf("%d",&b2.price);
	printf("Enter Details for 3rd Book\n");
	printf("Enter Title:");
	scanf("%s",b3.title);
	printf("Enter Author:");
	scanf("%s",b3.author);
	printf("Enter Publication:");
	scanf("%s",b3.publication);
	printf("Enter Price:");
	scanf("%d",&b3.price);
	printf("Details For 1st Book:\n");
	printf("Title:%s\n",b1.title);
	printf("Author:%s\n",b1.author);
	printf("Publication Name:%s\n",b1.publication);
	printf("Price:%d\n",b1.price);
	printf("Details For 2nd Book:\n");
	printf("Title:%s\n",b2.title);
	printf("Author:%s\n",b2.author);
	printf("Publication Name:%s\n",b2.publication);
	printf("Price:%d\n",b2.price);
	printf("Details For 3rd Book:\n");
	printf("Title:%s\n",b3.title);
	printf("Author:%s\n",b3.author);
	printf("Publication Name:%s\n",b3.publication);
	printf("Price:%d",b3.price);
}
