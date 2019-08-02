#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long int a,c=0,i,b,f,j=0,h,g;
  scanf("%ld",&a);
  f=a;
  while(a>0)
  {
    b=a%10;
      a=a/10;
    c++;
  }
  
  for(i=0;i<c;i++)
  {
    g=f%10;
    h=g*pow(2,i);
    j=h+j;
    f=f/10;
  }
  printf("%ld",j);
  return 0;
}