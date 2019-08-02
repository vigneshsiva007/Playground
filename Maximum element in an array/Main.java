#include<stdio.h>
int main()
{
  int a[100],n;
  scanf("%d",&n);
    for(int i=0;i<n;i++)
      scanf("%d",&a[i]);
  int max=a[0];
  for(int i=1;i<n-1;i++)
  {
if(max<a[i])
{
max=a[i];	//type your code here
}
  }
    printf("%d",max);
  }