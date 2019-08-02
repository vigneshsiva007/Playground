#include<stdio.h>
int main()
{
  int n,m,i,j,b,t;
  scanf("%d%d",&n,&m);
  i=n>m?m:n;
  for(j=i;j>-1;j--)
  {
if(n%i==0 && m%i==0)
{
  t=i;
  break;
}
  }
  if(t==0)
  {
    b=n*m;
    printf("%d",b);
  }
  else
  {
  b=n*m;
  n=b/t;
  printf("%d",n);
  }
  
  //Type your code here
  return 0;
}