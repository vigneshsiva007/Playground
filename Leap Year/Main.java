#include<stdio.h>
int main()
{
  long int a;
  scanf("%ld",&a);
  if(a%4==0 && a%100!=0 || a%400==0)
    printf("LEAP YEAR");
  else
    printf("NOT LEAP YEAR");
  //Type your code here
  return 0;
}