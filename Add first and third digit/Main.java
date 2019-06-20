#include<stdio.h>
int main()
{int n;
 scanf("%d",&n);
  int i=n%10;
  int j=(n/10)/10;
  printf("%d",i+j);
  return 0;
}