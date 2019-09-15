#include <stdio.h>
int main() {
	//Type your code
  int num,rem=0,sum=0;
  scanf("%d",&num);
  while(num!=0)
  {
    rem=num%10;
    sum=sum+rem;
    num=num/10;
  }
  printf("%d",sum);
	return 0;
}