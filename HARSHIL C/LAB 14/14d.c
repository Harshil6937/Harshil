#include <stdio.h>
void main()

{
		
    FILE *fp;
    char ch;

    fp = fopen("hii.txt", "r");

    fseek(fp, 5, SEEK_SET);  
    ch = fgetc(fp);
    printf("Character at position 5: %c\n", ch);

    rewind(fp);  
    ch = fgetc(fp);
    printf("First character: %c\n", ch);

    fclose(fp);

}
