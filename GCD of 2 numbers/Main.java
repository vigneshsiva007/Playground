// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n,m,gcd,i;
  scanf("%d%d",&n,&m);
  for(i=1;i<=n&&i<=m;i++)
  {
if(n%i==0 && m%i==0)
{
  gcd=i;
}
  }
    printf("%d",gcd);
  // Enter your code here 
  
   return 0;
}