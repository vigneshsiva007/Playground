#include<stdio.h>
#include<string.h>
int main()
{
 char s[100];
int c=0,i,j,k=0;
scanf("%s",s);
int v=strlen(s);
for(i=0;s[i]!='\0';i++)
{
    if(s[i]==s[i+1])
    {
        c++;
    }

     else if(c==v-1)
     {
       printf("Invalid Input");
       break;
     }
    else
    {
    printf("%c%d",s[i],c+1);
    c=0;
    }
}
	//type your code here
}