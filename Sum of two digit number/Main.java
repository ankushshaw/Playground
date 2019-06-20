#include<stdio.h>
int main()
{int n;
 scanf("%d",&n);
 int i=n%10;
 n=n/10;
 printf("%d",i+n);
  return 0;
}