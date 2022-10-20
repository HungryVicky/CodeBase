//https://www.hackerrank.com/challenges/c-tutorial-pointer/problem
#include <stdio.h>
void update(int *a,int *b) {
     int sum = *a+*b;
     int subr;
     
    if(*a>*b){
        subr = *a-*b;
    }
    else{
        subr = *b-*a;
    }
    *a=sum;
    *b=subr;
}
int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
