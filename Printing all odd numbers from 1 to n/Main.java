#include <stdio.h>
int main() {
	//Type your code
  int n,i=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
      continue;
    else
      printf("%d\n",i);
  }
	return 0;
}