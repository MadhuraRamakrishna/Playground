#include <stdio.h>
int main() {
	//Type your code
  int n,i,j;
  //printf("n=");
  scanf("%d",&n);
  for(i=1,j=1;j<=n;i=i+2,j++)
  {
    printf("%d\n",i);
  }
	return 0;
}