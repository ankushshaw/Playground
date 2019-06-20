#include <stdio.h>
int main() {
	int n,c=0,j=0,p;
    scanf("%d",&n);
     p=n;
    int i=n%10;
    while(n>0)
    {
     n=n/10;
      c++;
    }
    while(j<c-1)
    {p=p/10;
     j++;
    }
    printf("%d",i+p);
	return 0;
}